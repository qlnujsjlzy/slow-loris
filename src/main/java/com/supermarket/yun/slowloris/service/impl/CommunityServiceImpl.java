package com.supermarket.yun.slowloris.service.impl;

import com.supermarket.yun.slowloris.mapper.CommunityMapper;
import com.supermarket.yun.slowloris.service.CommunityService;
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
public class CommunityServiceImpl implements CommunityService {
    private final static Logger LOGGER = LogManager.getLogger();

    @Autowired
    private CommunityMapper communityMapper;

}
