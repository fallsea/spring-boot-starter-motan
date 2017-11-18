package com.fallsea.demo.service;

import com.fallsea.demo.pojo.Demo;
import com.weibo.api.motan.transport.async.MotanAsync;

/**
 * @Description: 测试接口
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:19:22
 */
@MotanAsync
public  interface MotanDemoService 
{
    
    String hello(String name);
    
    
    Demo test();
    
}
