package com.fallsea.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;

/**
 * @Description: motan client配置
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:20:25
 */
@Configuration
public class MotanClientConfig
{
    /**
     * @Description: 客户端配置
     * @author: fallsea
     * @date: 2017年11月18日 下午3:20:38
     * @return
     */
    @Bean(name = "fallseaClientBasicConfig")
    @ConfigurationProperties(prefix = "fallsea.motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        return config;
    }
}
