package com.fallsea.demo.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fallsea.demo.pojo.Demo;
import com.fallsea.demo.service.MotanDemoServiceAsync;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;

/**
 * @Description: 
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:25:25
 */
@RestController
public class DemoController
{
    
    @MotanReferer(basicReferer = "fallseaClientBasicConfig")
    private MotanDemoServiceAsync motanDemoService;
    
    @RequestMapping(value = "/demo")
    public Demo hello()
    {
        return motanDemoService.test();
    }
    
    
}
