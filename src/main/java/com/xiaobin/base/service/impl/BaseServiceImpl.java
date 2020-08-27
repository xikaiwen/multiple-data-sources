package com.xiaobin.base.service.impl;

import com.xiaobin.base.dao.BaseDao;
import com.xiaobin.base.entity.BaseEntity;
import com.xiaobin.base.service.BaseService;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author kevin
 * @since 2020/4/2 1:09 PM
 */
public class BaseServiceImpl<R extends BaseDao, E extends BaseEntity> implements BaseService<E> {

    @Autowired
    protected R dao;

    @Override
    public E findById(Integer id) {
        return (E) this.dao.selectByPrimaryKey(id);
    }
}
