package com.xiaobin.slave.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.xiaobin.base.service.impl.BaseServiceImpl;
import com.xiaobin.slave.dao.SlaveUserDao;
import com.xiaobin.slave.entity.SlaveUser;
import com.xiaobin.slave.service.ISlaveUserService;
import com.xiaobin.web.entity.User;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:04 PM
 */
@Service("slaveUserServiceImpl")
@Transactional(propagation = Propagation.REQUIRED, rollbackFor = Exception.class, transactionManager = "slaveTransactionManager")
public class SlaveUserServiceImpl extends BaseServiceImpl<SlaveUserDao, SlaveUser> implements ISlaveUserService {

    @Override
    public SlaveUser findUserName(Integer id) {
        return super.findById(id);
    }

    @Override
    public List<SlaveUser> getSlaveByMapper() {
        return dao.findAll();
    }

    @Override
    public PageInfo<SlaveUser> findListByPage() {
        PageHelper.startPage(1, 3);
        List<SlaveUser> all = dao.findAll();
        return new PageInfo<>(all);
    }
}
