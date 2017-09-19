package com.fallsea.motan.demo.service.impl;

import com.fallsea.motan.demo.service.MotanDemoService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * @描述: 
 * @版权: Copyright (c) 2017
 * @作者: fallsea.com
 * @版本: 1.0
 * @创建日期: 2017年9月19日
 * @创建时间: 下午3:17:48
 */
@MotanService
public class MotanDemoServiceImpl implements MotanDemoService
{
    
    @Override
    public String hello(String name)
    {
        return "Hello " + name + "!";
    }
    
}
