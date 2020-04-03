package com.xiaobin.web.service;


import com.xiaobin.web.entity.User;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
public interface IUserService {

    User findUserName(Integer id);
}
