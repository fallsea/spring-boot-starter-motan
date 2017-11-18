package com.fallsea.demo.web;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fallsea.demo.service.MotanDemoServiceAsync;
import com.weibo.api.motan.config.springsupport.annotation.MotanReferer;
import com.weibo.api.motan.rpc.ResponseFuture;

/**
 * @Description: 异步测试
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:25:21
 */
@Controller
@RequestMapping("/hello")
public class HelloController
{
    
    @MotanReferer(basicReferer = "fallseaClientBasicConfig")
    private MotanDemoServiceAsync motanDemoService;
    
    @RequestMapping(value = "/{name}")
    @ResponseBody
    public String hello(@PathVariable String name)
    {
        ResponseFuture future = motanDemoService.helloAsync("测试");
        ResponseFuture future2 = motanDemoService.helloAsync("测试2222222");
        System.err.println(future.getValue());
        System.err.println(future2.getValue());
        
        return motanDemoService.hello(name);
    }
    
    
}
