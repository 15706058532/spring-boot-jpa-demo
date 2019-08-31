package com.lzf.springbootjpademo.primary.controller;

import com.lzf.springbootjpademo.primary.entity.Buyer;
import com.lzf.springbootjpademo.primary.service.BuyerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 购买者
 * <br/>
 * Created in 2019-08-27 23:11:54
 * <br/>
 *
 * @author Zhenfeng Li
 */
@RestController
@RequestMapping("/buyer")
public class BuyerController {
    private Logger logger = LoggerFactory.getLogger(BuyerController.class);
    private final BuyerService buyerService;

    @Autowired
    public BuyerController(BuyerService buyerService) {
        this.buyerService = buyerService;
    }
    @GetMapping("/all")
    public List<Buyer> queryAllBuyer(){
        return buyerService.queryAllBuyer();
    }

}
