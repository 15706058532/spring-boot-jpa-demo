package com.lzf.springbootjpademo.secondary.controller;

import com.lzf.springbootjpademo.secondary.entity.User;
import com.lzf.springbootjpademo.secondary.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2019-08-27 23:11:34
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/user")
public class UserController {
    private Logger logger = LoggerFactory.getLogger(UserController.class);
    private final UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @GetMapping("/all")
    public List<User> queryAllUser(){
        return userService.queryAllUser();
    }

}
