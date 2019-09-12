package com.lzf.springbootjpademo.primary.service.impl;

import com.lzf.springbootjpademo.primary.entity.Order;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import com.lzf.springbootjpademo.primary.service.OrderService;
import com.lzf.springbootjpademo.primary.repository.OrderRepository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class OrderServiceImpl implements OrderService {
	private Logger logger = LoggerFactory.getLogger(OrderServiceImpl.class);
	private final OrderRepository orderRepository;

	@Autowired
	public OrderServiceImpl(OrderRepository orderRepository) {
		this.orderRepository = orderRepository;
	}


	@Override
	public List<Order> findAll() {
		return orderRepository.findAllByOrderByOrderNo();
	}

	@Override
	public List<Order> queryLazyAll() {
		List<Order> orders = orderRepository.queryAllByOrderByOrderNo();
//		orders.forEach(order -> {
//			order.setOrderDetails(null);
//		});
		return orders;
	}
}
