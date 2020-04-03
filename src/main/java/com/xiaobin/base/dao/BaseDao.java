package com.xiaobin.base.dao;

import com.xiaobin.base.entity.BaseEntity;
import tk.mybatis.mapper.common.base.BaseDeleteMapper;
import tk.mybatis.mapper.common.base.BaseInsertMapper;
import tk.mybatis.mapper.common.base.BaseSelectMapper;
import tk.mybatis.mapper.common.base.BaseUpdateMapper;
import tk.mybatis.mapper.common.example.SelectByExampleMapper;

/**
 * @author kevin
 * @since 2020/4/2 1:10 PM
 */
public interface BaseDao<T extends BaseEntity> extends BaseSelectMapper<T>, BaseInsertMapper<T>, BaseUpdateMapper<T>, BaseDeleteMapper<T>, SelectByExampleMapper<T> {
}
