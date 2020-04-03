package com.xiaobin.web.controller;

import com.xiaobin.annotation.DataSource;
import com.xiaobin.web.entity.User;
import com.xiaobin.web.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author kevin
 * @since 2020/4/2 1:36 PM
 */
@RestController
@RequestMapping("/")
public class DataController {

    @Autowired
    private IUserService userService;

    /**
     * 一定要加DataSource注解不然切面获取不到
     */
    @DataSource(name = "data-master")
    @GetMapping("getMasterName/{id}")
    public String getMasterName(@PathVariable Integer id){
        User user = userService.findUserName(id);
        return user.getName();
    }

    @DataSource(name = "data-slave")
    @GetMapping("getSlaveName/{id}")
    public String getSlaveName(@PathVariable Integer id){
        User user = userService.findUserName(id);
        return user.getName();
    }
}
