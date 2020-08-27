package com.xiaobin.web.controller;

import com.github.pagehelper.PageInfo;
import com.xiaobin.slave.entity.SlaveUser;
import com.xiaobin.slave.service.ISlaveUserService;
import com.xiaobin.web.entity.User;
import com.xiaobin.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

/**
 * @author kevin
 * @since 2020/4/2 1:36 PM
 */
@RestController
@RequestMapping("/")
public class DataController {

    @Autowired
    private IUserService userService;

    @Autowired
    private ISlaveUserService slaveUserService;

    /**
     * 获取master数据库数据
     * @param id
     * @return
     */
    @GetMapping("getMasterName/{id}")
    public String getMasterName(@PathVariable Integer id){
        User user = userService.findUserName(id);
        return user.getName();
    }

    /**
     * 获取slave数据库数据
     * @param id
     * @return
     */
    @GetMapping("getSlaveName/{id}")
    public String getSlaveName(@PathVariable Integer id){
        SlaveUser user = slaveUserService.findUserName(id);
        return user.getName();
    }

    /**
     * 通过mapper获取master数据库数据
     */
    @GetMapping("getMasterByMapper")
    public Object getMasterByMapper(){
        List<User> user = userService.getMasterByMapper();
        return user;
    }

    /**
     * 通过mapper获取slave数据库数据
     */
    @GetMapping("getSlaveByMapper")
    public Object getSlaveByMapper(){
        List<SlaveUser> user = slaveUserService.getSlaveByMapper();
        return user;
    }

    /**
     * 同时查询两个数据库
     * @return
     */
    @GetMapping("select2DataSource")
    public Object select2DataSource(){
        SlaveUser slaveUser = slaveUserService.findUserName(1);
        User user = userService.findUserName(1);
        return "master user name is:" + user.getName()+"------slave user name is: " + slaveUser.getName();
    }

    /**
     * 分页查询测试
     * @return
     */
    @GetMapping("selectByPageHelper")
    public Object selectByPageHelper(){
        PageInfo<SlaveUser> slaveUserPageInfo = slaveUserService.findListByPage();
        PageInfo<User> userPageInfo = userService.findListByPage();
        return userPageInfo;
    }

}
