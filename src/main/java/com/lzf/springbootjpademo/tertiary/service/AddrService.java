package com.lzf.springbootjpademo.tertiary.service;

import com.lzf.springbootjpademo.tertiary.entity.Addr;

import java.util.List;

/**
 * 收货地址
 * <br/>
 * Created in 2019-08-31 15:03:40
 * <br/>
 *
 * @author Zhenfeng Li
 */
public interface AddrService {
    /**
     * 查询所有地址
     * @return
     */
    List<Addr> queryAllAddr();

}
