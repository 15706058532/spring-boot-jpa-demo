package com.lzf.springbootjpademo.primary.controller;

import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.springbootjpademo.primary.service.OrderDetailService;

/**
 * 写点注释
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/orderDetail")
public class OrderDetailController {
	private Logger logger = LoggerFactory.getLogger(OrderDetailController.class); 
	private final OrderDetailService orderDetailService;

	@Autowired
	public OrderDetailController(OrderDetailService orderDetailService) {
		this.orderDetailService = orderDetailService;
	}

}
