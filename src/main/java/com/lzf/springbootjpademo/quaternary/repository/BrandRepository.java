package com.lzf.springbootjpademo.quaternary.repository;

import com.lzf.springbootjpademo.quaternary.entity.Brand;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

/**
 * 品牌
 * <br/>
 * Created in 2019-09-01 11:11:56
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface BrandRepository extends JpaRepository<Brand,Object>, JpaSpecificationExecutor<Brand> {
}
