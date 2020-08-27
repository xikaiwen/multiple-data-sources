package com.xiaobin.slave.dao;

import com.xiaobin.base.dao.BaseDao;
import com.xiaobin.slave.entity.SlaveUser;
import com.xiaobin.web.entity.User;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:20 PM
 */
@Mapper
@Repository
public interface SlaveUserDao extends BaseDao<SlaveUser> {
    List<SlaveUser> findAll();
}
