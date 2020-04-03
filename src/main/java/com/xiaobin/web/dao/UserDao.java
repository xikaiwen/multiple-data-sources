package com.xiaobin.web.dao;

import com.xiaobin.base.dao.BaseDao;
import com.xiaobin.web.entity.User;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author kevin
 * @since 2020/4/2 1:20 PM
 */
@Mapper
public interface UserDao extends BaseDao<User> {
    User queryAllWithMaster();
    User queryAllWithSlave();
}
