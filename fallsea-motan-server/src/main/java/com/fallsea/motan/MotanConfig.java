package com.fallsea.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

/**
 * @Description: motan通用配置
 * @Copyright: 2017 www.fallsea.com Inc. All rights reserved.
 * @author: fallsea
 * @version 1.0
 * @date: 2017年11月18日 下午3:20:48
 */
@Configuration
public class MotanConfig
{
    /**
     * @Description: 声明Annotation用来指定需要解析的包名
     * @author: fallsea
     * @date: 2017年11月18日 下午3:20:54
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "fallsea.motan.annotation")
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        return motanAnnotationBean;
    }
    
    /**
     * @Description: 协议配置
     * @author: fallsea
     * @date: 2017年11月18日 下午3:20:59
     * @return
     */
    @Bean(name = "fallseaMotan")
    @ConfigurationProperties(prefix = "fallsea.motan.protocol")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        return config;
    }

    /**
     * @Description: 注册中心配置
     * @author: fallsea
     * @date: 2017年11月18日 下午3:21:04
     * @return
     */
    @Bean(name = "fallseaRegistryConfig")
    @ConfigurationProperties(prefix = "fallsea.motan.registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        return config;
    }
}
