package com.supermarket.yun.slowloris.controller;

import com.supermarket.yun.slowloris.service.ProductService;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 朝阳
 * @version : v1.0
 * @email : licy13@lenovo.com
 * @time : 2017/11/13 21:51
 */
@RestController
@RequestMapping("/product")
public class ProductController {
    private final static Logger LOGGER = LogManager.getLogger();

    @Autowired
    private ProductService productService;

}
