package com.fallsea.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.BasicServiceConfigBean;

/**
 * @Description: motan server配置
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:21:28
 */
@Configuration
public class MotanServerConfig
{
    /**
     * @Description: 服务端配置
     * @author: fallsea
     * @date: 2017年11月18日 下午3:21:33
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "fallsea.motan.server")
    public BasicServiceConfigBean baseServiceConfig() {
        BasicServiceConfigBean config = new BasicServiceConfigBean();
        return config;
    }
}
