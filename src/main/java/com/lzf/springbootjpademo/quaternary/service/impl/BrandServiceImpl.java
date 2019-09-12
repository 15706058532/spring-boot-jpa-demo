package com.lzf.springbootjpademo.quaternary.service.impl;

import com.lzf.springbootjpademo.quaternary.entity.Brand;
import com.lzf.springbootjpademo.quaternary.repository.BrandRepository;
import com.lzf.springbootjpademo.quaternary.service.BrandService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 品牌
 * <br/>
 * Created in 2019-09-01 11:11:56
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class BrandServiceImpl implements BrandService {
    private Logger logger = LoggerFactory.getLogger(BrandServiceImpl.class);
    private final BrandRepository brandRepository;

    @Autowired
    public BrandServiceImpl(BrandRepository brandRepository) {
        this.brandRepository = brandRepository;
    }

    @Override
    public List<Brand> queryAllBrand() {
        return brandRepository.findAll();
    }
}
