package com.hello.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.common.Response;
import com.hello.model.User;
import com.hello.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * 用户表 前端控制器
 * </p>
 *
 * @author xjliu
 * @since 2021-07-02
 */
@RestController
@RequestMapping("/user")
public class UserController extends BaseController {
    @Resource
    private IUserService userService;

    @GetMapping(value = "/{id}")
    public Response findById(@PathVariable("id") Long id) {
        User user = userService.getById(id);
        return Response.success(user);
    }

    @GetMapping
    public Response list() {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.in("id", Arrays.asList(1, 2, 3))
                .orderByDesc("id");
        List<User> userList = userService.list(wrapper);
        return Response.success(userList);
    }

    @GetMapping("/page")
    public Response pageList(Page page) {
        QueryWrapper<User> wrapper = new QueryWrapper<>();
        wrapper.select("id", "username", "phone", "create_time", "version")
                .orderByDesc("id");
        Page userPage = userService.pageList(page, wrapper);
        return Response.success(userPage);
    }

    @PostMapping
    public Response save(@RequestBody User user) {
        boolean success;
        if (null == user.getId()) {
            success = userService.save(user);
        } else {
            User oldUser = userService.getById(user.getId());
            if (null == oldUser) {
                return Response.error();
            }
            oldUser.setUsername(user.getUsername());
            oldUser.setPhone(user.getPhone());
            success = userService.updateById(oldUser);
        }
        if (success) {
            return Response.success();
        } else {
            return Response.error();
        }
    }

    @DeleteMapping(value = "/{id}")
    public Response delete(@PathVariable(value = "id") Long id) {
        boolean success = userService.removeById(id);
        if (success) {
            return Response.success();
        } else {
            return Response.error();
        }
    }

}
