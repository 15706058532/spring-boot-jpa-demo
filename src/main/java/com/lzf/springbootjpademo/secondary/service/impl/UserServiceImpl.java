package com.lzf.springbootjpademo.secondary.service.impl;

import com.lzf.springbootjpademo.secondary.entity.User;
import com.lzf.springbootjpademo.secondary.repository.UserRepository;
import com.lzf.springbootjpademo.secondary.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 写点注释
 * <br/>
 * Created in 2019-08-27 23:11:34
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class UserServiceImpl implements UserService {
    private Logger logger = LoggerFactory.getLogger(UserServiceImpl.class);
    private final UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public List<User> queryAllUser() {

        return userRepository.findAll();
    }
}
