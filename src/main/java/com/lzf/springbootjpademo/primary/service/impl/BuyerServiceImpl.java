package com.lzf.springbootjpademo.primary.service.impl;

import com.lzf.springbootjpademo.primary.entity.Buyer;
import com.lzf.springbootjpademo.primary.repository.BuyerRepository;
import com.lzf.springbootjpademo.primary.service.BuyerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 购买者
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class BuyerServiceImpl implements BuyerService {
    private Logger logger = LoggerFactory.getLogger(BuyerServiceImpl.class);
    private final BuyerRepository buyerRepository;

    @Autowired
    public BuyerServiceImpl(BuyerRepository buyerRepository) {
        this.buyerRepository = buyerRepository;
    }

    @Override
    public List<Buyer> queryAllBuyer() {
        return buyerRepository.findAll();
    }
}
