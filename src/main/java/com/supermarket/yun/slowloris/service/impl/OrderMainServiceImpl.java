package com.supermarket.yun.slowloris.service.impl;

import com.supermarket.yun.slowloris.mapper.OrderMainMapper;
import com.supermarket.yun.slowloris.service.OrderMainService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


/**
 * @author : 朝阳
 * @version : v1.0
 * @email : licy13@lenovo.com
 * @time : 2017/11/13 21:51
 */
@Service
public class OrderMainServiceImpl implements OrderMainService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Autowired
    private OrderMainMapper orderMainMapper;

}
