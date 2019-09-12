package com.lzf.springbootjpademo.quaternary.service;

import com.lzf.springbootjpademo.quaternary.entity.Brand;

import java.util.List;

/**
 * 品牌
 * <br/>
 * Created in 2019-09-01 11:11:56
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface BrandService {
    /**
     * 查询所有品牌
     *
     * @return
     */
    List<Brand> queryAllBrand();
}
