package com.xiaobin.base.service;


import com.xiaobin.base.entity.BaseEntity;

/**
 * @author kevin
 * @since 2020/4/2 1:08 PM
 */
public interface BaseService<E extends BaseEntity> {

    E findById(Integer id);

}
