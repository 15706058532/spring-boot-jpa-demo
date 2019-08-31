package com.lzf.springbootjpademo.primary.repository;

import com.lzf.springbootjpademo.primary.entity.Buyer;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 购买者
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface BuyerRepository extends JpaRepository<Buyer,Long>, JpaSpecificationExecutor<Buyer> {
}
