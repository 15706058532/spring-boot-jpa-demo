package com.lzf.springbootjpademo.secondary.service;

import com.lzf.springbootjpademo.secondary.entity.User;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2019-08-27 23:11:34
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface UserService {
    /**
     * 查询所有用户
     *
     * @return
     */
    List<User> queryAllUser();

}
