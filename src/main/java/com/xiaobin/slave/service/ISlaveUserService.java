package com.xiaobin.slave.service;


import com.github.pagehelper.PageInfo;
import com.xiaobin.slave.entity.SlaveUser;
import com.xiaobin.web.entity.User;

import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
public interface ISlaveUserService {

    SlaveUser findUserName(Integer id);

    List<SlaveUser> getSlaveByMapper();

    PageInfo<SlaveUser> findListByPage();
}
