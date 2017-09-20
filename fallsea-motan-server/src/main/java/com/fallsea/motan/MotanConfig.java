package com.fallsea.motan;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.weibo.api.motan.config.springsupport.AnnotationBean;
import com.weibo.api.motan.config.springsupport.ProtocolConfigBean;
import com.weibo.api.motan.config.springsupport.RegistryConfigBean;

/**
 * @描述: motan通用配置
 * @版权: Copyright (c) 2017
 * @作者: fallsea.com
 * @版本: 1.0
 * @创建日期: 2017年9月19日
 * @创建时间: 下午3:19:34
 */
@Configuration
public class MotanConfig
{
    /**
     * @描述: 声明Annotation用来指定需要解析的包名
     * @作者: fallsea.com
     * @时间: 2017年9月15日 下午9:29:54
     * @return
     */
    @Bean
    @ConfigurationProperties(prefix = "fallsea.motan.annotation")
    public AnnotationBean motanAnnotationBean() {
        AnnotationBean motanAnnotationBean = new AnnotationBean();
        return motanAnnotationBean;
    }
    
    /**
     * @描述: 协议配置
     * @作者: fallsea.com
     * @时间: 2017年9月17日 下午6:13:31
     * @return
     */
    @Bean(name = "fallseaMotan")
    @ConfigurationProperties(prefix = "fallsea.motan.protocol")
    public ProtocolConfigBean protocolConfig() {
        ProtocolConfigBean config = new ProtocolConfigBean();
        return config;
    }

    /**
     * @描述: 注册中心配置
     * @作者: fallsea.com
     * @时间: 2017年9月17日 下午6:13:41
     * @return
     */
    @Bean(name = "fallseaRegistryConfig")
    @ConfigurationProperties(prefix = "fallsea.motan.registry")
    public RegistryConfigBean registryConfig() {
        RegistryConfigBean config = new RegistryConfigBean();
        return config;
    }
}
