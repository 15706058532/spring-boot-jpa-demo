package com.lzf.springbootjpademo.secondary.repository;

import com.lzf.springbootjpademo.secondary.entity.User;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 写点注释
 * <br/>
 * Created in 2019-08-27 23:11:34
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface UserRepository extends JpaRepository<User,Integer>, JpaSpecificationExecutor<User> {
}
