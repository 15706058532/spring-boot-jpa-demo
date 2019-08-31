package com.lzf.springbootjpademo.primary.service;

import com.lzf.springbootjpademo.primary.entity.Buyer;

import java.util.List;

/**
 * 购买者
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface BuyerService {

    /**
     * 查询所有用户
     *
     * @return
     */
    List<Buyer> queryAllBuyer();

}
