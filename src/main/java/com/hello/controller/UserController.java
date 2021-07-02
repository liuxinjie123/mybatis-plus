package com.hello.controller;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.hello.common.Response;
import com.hello.model.User;
import com.hello.service.IUserService;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import java.sql.Wrapper;
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
public class UserController {
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

    @PostMapping
    public Response save(@RequestBody User user) {
        boolean success = userService.saveOrUpdate(user);
        if (success) {
            return Response.success();
        } else {
            return Response.error();
        }
    }

}
