package com.hello.service;

import com.baomidou.mybatisplus.core.conditions.Wrapper;
import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.hello.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;

import java.util.List;

/**
 * <p>
 * 用户表 服务类
 * </p>
 *
 * @author xjliu
 * @since 2021-07-02
 */
public interface IUserService extends IService<User> {

    List<User> selectList(Wrapper wrapper);

    Page pageList(Page page, Wrapper wrapper);
}
