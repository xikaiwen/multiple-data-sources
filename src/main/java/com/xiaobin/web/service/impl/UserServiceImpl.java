package com.xiaobin.web.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaobin.base.service.impl.BaseServiceImpl;
import com.xiaobin.web.dao.UserDao;
import com.xiaobin.web.entity.User;
import com.xiaobin.web.service.IUserService;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
@Service("masterUserServiceImpl")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, transactionManager = "masterTransactionManager")
public class UserServiceImpl extends BaseServiceImpl<UserDao, User> implements IUserService {

    @Override
    public User findUserName(Integer id) {
        return super.findById(id);
    }

    @Override
    public List<User> getMasterByMapper() {
        return dao.findAll();
    }

    @Override
    public PageInfo<User> findListByPage() {
        PageHelper.startPage(1,2);
        List<User> all = dao.findAll();
        return new PageInfo<>(all);
    }
}
