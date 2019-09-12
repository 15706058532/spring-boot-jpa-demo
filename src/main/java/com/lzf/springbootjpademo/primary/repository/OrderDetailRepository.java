package com.lzf.springbootjpademo.primary.repository;

import com.lzf.springbootjpademo.primary.entity.OrderDetail;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 写点注释
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,Long>, JpaSpecificationExecutor<OrderDetail> {
}
