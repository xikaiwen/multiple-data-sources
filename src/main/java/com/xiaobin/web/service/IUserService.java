package com.xiaobin.web.service;


import com.github.pagehelper.PageInfo;
import com.xiaobin.web.entity.User;

import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
public interface IUserService {

    User findUserName(Integer id);

    List<User> getMasterByMapper();

    PageInfo<User> findListByPage();
}
