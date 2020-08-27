package com.xiaobin.slave.entity;

import com.xiaobin.base.entity.BaseEntity;
import lombok.Data;

import javax.persistence.Table;

/**
 * @author kevin
 * @since 2020/8/27 4:19 PM
 */
@Data
@Table(name = "user")
public class SlaveUser extends BaseEntity {
    private String name;
}
