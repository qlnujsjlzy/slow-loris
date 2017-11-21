package com.supermarket.yun.slowloris.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author : 朝阳
 * @version : v1.0
 * @email : licy13@lenovo.com
 * @time : 2017/11/13 21:51
 */
@RestController
@RequestMapping("/test")
public class TestController {
    private final static Logger LOGGER = LogManager.getLogger();

    @RequestMapping("/index")
    public String index() {
        return "test success!";
    }
}
