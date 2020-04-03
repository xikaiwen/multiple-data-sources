package com.xiaobin.web.dao;

import com.xiaobin.base.dao.BaseDao;
import com.xiaobin.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

/**
 * @author kevin
 * @since 2020/4/2 1:20 PM
 */
@Mapper
@Repository
public interface UserDao extends BaseDao<User> {
    User queryAllWithMaster();
    User queryAllWithSlave();
}
