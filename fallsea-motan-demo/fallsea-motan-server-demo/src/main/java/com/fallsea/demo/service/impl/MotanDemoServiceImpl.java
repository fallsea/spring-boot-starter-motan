package com.fallsea.demo.service.impl;

import java.math.BigDecimal;

import com.fallsea.demo.pojo.Demo;
import com.fallsea.demo.service.MotanDemoService;
import com.weibo.api.motan.config.springsupport.annotation.MotanService;

/**
 * @Description: 测试服务类
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:24:29
 */
@MotanService
public class MotanDemoServiceImpl implements MotanDemoService
{
    
    @Override
    public String hello(String name)
    {
        System.err.println("开始进入---------------"+name);
        try
        {
            Thread.sleep(5000);
        }
        catch (Exception e)
        {
            // TODO: handle exception
        }
        return "Hello " + name + "!";
    }

    @Override
    public Demo test()
    {
        Demo demo = new Demo();
        demo.setId(new BigDecimal(10000));
        demo.setName("fallsea");
        return demo;
    }
}
