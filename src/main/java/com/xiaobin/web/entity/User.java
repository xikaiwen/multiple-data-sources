package com.xiaobin.web.entity;

import com.xiaobin.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

/**
 * @author kevin
 * @since 2020/4/2 1:21 PM
 */
@Data
@Table(name = "user")
public class User extends BaseEntity {

    private String name;
}
