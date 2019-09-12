package com.lzf.springbootjpademo.primary.service.impl;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lzf.springbootjpademo.primary.service.OrderDetailService;
import com.lzf.springbootjpademo.primary.repository.OrderDetailRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 写点注释
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class OrderDetailServiceImpl implements OrderDetailService {
	private Logger logger = LoggerFactory.getLogger(OrderDetailServiceImpl.class); 
	private final OrderDetailRepository orderDetailRepository;

	@Autowired
	public OrderDetailServiceImpl(OrderDetailRepository orderDetailRepository) {
		this.orderDetailRepository = orderDetailRepository;
	}

}
