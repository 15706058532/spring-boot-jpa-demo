package com.lzf.springbootjpademo.primary.service;

import com.lzf.springbootjpademo.primary.entity.Order;

import java.util.List;

/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface OrderService {
    /**
     * 懒加载全部
     *
     * @return 返回全部
     */
    public List<Order> findAll();

    /**
     * 非懒加载全部
     *
     * @return 返回全部
     */
    public List<Order> queryLazyAll();
}
