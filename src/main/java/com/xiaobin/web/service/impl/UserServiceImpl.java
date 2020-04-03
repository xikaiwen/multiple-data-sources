package com.xiaobin.web.service.impl;

import com.xiaobin.base.service.impl.BaseServiceImpl;
import com.xiaobin.web.dao.UserDao;
import com.xiaobin.web.entity.User;
import com.xiaobin.web.service.IUserService;
import org.springframework.stereotype.Service;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
@Service
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements IUserService {

    @Override
    public User findUserName(Integer id) {
        return super.findById(id);
    }
}
