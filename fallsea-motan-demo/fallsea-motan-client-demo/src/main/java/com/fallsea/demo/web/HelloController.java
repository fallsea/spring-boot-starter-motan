package com.fallsea.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallsea.demo.service.MotanDemoService;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;

/**
 * @描述: 
 * @版权: Copyright (c) 2017
 * @作者: fallsea.com
 * @版本: 1.0
 * @创建日期: 2017年9月19日
 * @创建时间: 下午3:34:31
 */
@Controller
@RequestMapping("/hello")
public class HelloController
{
    
    @MotanReferer(basicReferer = "fallseaClientBasicConfig")
    private MotanDemoService motanDemoService;
    
    @RequestMapping(value = "/{name}")
    @ResponseBody
    public String hello(@PathVariable String name)
    {
        return motanDemoService.hello(name);
    }
    
}
