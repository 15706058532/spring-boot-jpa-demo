package com.lzf.springbootjpademo.tertiary.repository;

import com.lzf.springbootjpademo.tertiary.entity.Addr;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 收货地址
 * <br/>
 * Created in 2019-08-31 15:03:40
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface AddrRepository extends JpaRepository<Addr,Long>, JpaSpecificationExecutor<Addr> {
}
