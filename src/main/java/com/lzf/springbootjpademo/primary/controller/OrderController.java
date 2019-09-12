package com.lzf.springbootjpademo.primary.controller;

import com.lzf.springbootjpademo.common.BeanMapper;
import com.lzf.springbootjpademo.common.JPAResult;
import com.lzf.springbootjpademo.primary.entity.Order;
import com.lzf.springbootjpademo.primary.resp.OrderResp;
import com.lzf.springbootjpademo.primary.service.OrderService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 订单
 * <br/>
 * Created in 2019-09-11 10:10:42
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/order")
public class OrderController {
    private Logger logger = LoggerFactory.getLogger(OrderController.class);
    private final OrderService orderService;

    @Autowired
    public OrderController(OrderService orderService) {
        this.orderService = orderService;
    }

    @GetMapping("/all")
    public JPAResult findAll() {
        List<Order> all = orderService.findAll();
        List<OrderResp> orderResps = BeanMapper.mapList(all, OrderResp.class);
        return JPAResult.ok(orderResps);
    }
	@GetMapping("/lazy/all")
	public JPAResult findLazyAll() {
		List<Order> all = orderService.queryLazyAll();
        List<OrderResp> orderResps = BeanMapper.mapList(all, OrderResp.class);
        return JPAResult.ok(all);
	}
}
