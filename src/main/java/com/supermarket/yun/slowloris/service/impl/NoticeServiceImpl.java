package com.supermarket.yun.slowloris.service.impl;

import com.supermarket.yun.slowloris.mapper.NoticeMapper;
import com.supermarket.yun.slowloris.service.NoticeService;
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
public class NoticeServiceImpl implements NoticeService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Autowired
    private NoticeMapper noticeMapper;

}
