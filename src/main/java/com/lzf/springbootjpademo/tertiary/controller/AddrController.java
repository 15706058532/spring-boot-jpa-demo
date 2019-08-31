package com.lzf.springbootjpademo.tertiary.controller;

import com.lzf.springbootjpademo.tertiary.entity.Addr;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.springbootjpademo.tertiary.service.AddrService;

import java.util.List;

/**
 * 收货地址
 * <br/>
 * Created in 2019-08-31 15:03:40
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/addr")
public class AddrController {
	private Logger logger = LoggerFactory.getLogger(AddrController.class); 
	private final AddrService addrService;

	@Autowired
	public AddrController(AddrService addrService) {
		this.addrService = addrService;
	}
	@GetMapping("/all")
	public List<Addr> queryAllAddr(){
		return addrService.queryAllAddr();
	}

}
