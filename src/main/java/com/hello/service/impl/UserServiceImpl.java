package com.hello.service.impl;

import com.baomidou.dynamic.datasource.annotation.DS;
import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.model.entity.User;
import com.hello.mapper.UserMapper;
import com.hello.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

/**
 * <p>
 * 用户表 服务实现类
 * </p>
 *
 * @author xjliu
 * @since 2021-07-02
 */
@Service
@DS(value = "master")
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {
    @Resource
    private UserMapper userMapper;

    @Override
    @DS(value = "slave_1")
    public List<User> selectList(Wrapper wrapper) {
        return userMapper.selectList(wrapper);
    }

    @Override
    @DS(value = "slave_2")
    public Page pageList(Page page, Wrapper wrapper) {
        return userMapper.selectPage(page, wrapper);
    }
}
