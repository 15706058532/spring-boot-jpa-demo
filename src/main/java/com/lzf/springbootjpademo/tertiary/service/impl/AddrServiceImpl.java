package com.lzf.springbootjpademo.tertiary.service.impl;

import com.lzf.springbootjpademo.tertiary.entity.Addr;
import com.lzf.springbootjpademo.tertiary.repository.AddrRepository;
import com.lzf.springbootjpademo.tertiary.service.AddrService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 收货地址
 * <br/>
 * Created in 2019-08-31 15:03:40
 * <br/>
 *
 * @author Zhenfeng Li
 */
@Service
public class AddrServiceImpl implements AddrService {
    private Logger logger = LoggerFactory.getLogger(AddrServiceImpl.class);
    private final AddrRepository addrRepository;

    @Autowired
    public AddrServiceImpl(AddrRepository addrRepository) {
        this.addrRepository = addrRepository;
    }

    @Override
    public List<Addr> queryAllAddr() {

        return addrRepository.findAll();
    }
}
