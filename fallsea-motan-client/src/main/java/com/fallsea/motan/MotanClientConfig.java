package com.fallsea.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicRefererConfigBean;

/**
 * @描述: motan client配置
 * @版权: Copyright (c) 2017
 * @作者: fallsea.com
 * @版本: 1.0
 * @创建日期: 2017年9月19日
 * @创建时间: 下午3:21:15
 */
@Configuration
public class MotanClientConfig
{
    /**
     * @描述: 客户端配置
     * @作者: fallsea.com
     * @时间: 2017年9月17日 下午6:32:42
     * @return
     */
    @Bean(name = "fallseaClientBasicConfig")
    @ConfigurationProperties(prefix = "fallsea.motan.client")
    public BasicRefererConfigBean baseRefererConfig() {
        BasicRefererConfigBean config = new BasicRefererConfigBean();
        return config;
    }
}
