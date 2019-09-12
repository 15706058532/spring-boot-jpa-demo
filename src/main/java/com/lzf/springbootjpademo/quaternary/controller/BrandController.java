package com.lzf.springbootjpademo.quaternary.controller;

import com.lzf.springbootjpademo.quaternary.entity.Brand;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import com.lzf.springbootjpademo.quaternary.service.BrandService;

import java.util.List;

/**
 * 品牌
 * <br/>
 * Created in 2019-09-01 11:11:56
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/brand")
public class BrandController {
	private Logger logger = LoggerFactory.getLogger(BrandController.class); 
	private final BrandService brandService;

	@Autowired
	public BrandController(BrandService brandService) {
		this.brandService = brandService;
	}
	@GetMapping("/all")
	public List<Brand> queryAllBrand(){
		return brandService.queryAllBrand();
	}

}
