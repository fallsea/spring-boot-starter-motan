# spring boot motan
[![License](https://img.shields.io/badge/license-Apache2.0-blue.svg)](LICENSE)
[![GitHub stars](https://img.shields.io/github/stars/fallsea/spring-boot-starter-motan.svg?style=social&label=Stars)](https://github.com/fallsea/spring-boot-starter-motan)
[![GitHub forks](https://img.shields.io/github/forks/fallsea/spring-boot-starter-motan.svg?style=social&label=Fork)](https://github.com/fallsea/spring-boot-starter-motan)

# 项目介绍
> motan基于spring boot 整合demo，motan配置信息存放在application.yml中，详细配置请参考[配置清单](https://github.com/weibocom/motan/wiki/zh_configuration)
> 此demo基于zookeeper 注册中心，如果要直接启动，需要安装zookeeper，也可以使用其他注册中心

# 项目结构
``` lua
spring-boot-starter-motan
├── fallsea-motan-client -- 客户端通用配置
├── fallsea-motan-server -- 服务端通用配置
├── fallsea-motan-demo -- demo 示例
|    ├── fallsea-motan-api-demo -- api 示例
|    ├── fallsea-motan-client-demo -- 客户端调用示例
|    ├── fallsea-motan-server-demo -- 服务端示例
```

# 服务端
> 启动类 MotanServer  
> 配置说明，详细配置请参考[配置清单](https://github.com/weibocom/motan/wiki/zh_configuration)

```
fallsea : 
    motan : 
        #注册中心配置
        registry : 
            regProtocol : zookeeper #注册中心协议
            address : 127.0.0.1:2181 #注册中心地址
            requestTimeout : 1000 #注册中心连接超时时间(毫秒)
            connectTimeout : 3000 #注册中心请求超时时间(毫秒)
        #协议配置
        protocol : 
            name : motan #协议名称
            minWorkerThread : 20 #最小工作pool线程数
            maxWorkerThread : 50 #最大工作pool线程数
            filter : statistic
        #指定需要解析的包名
        annotation :
            package : com.fallsea.demo
        #服务端配置
        server : 
            export :  'fallseaMotan:9999' #服务端口
            group : fallsea
            registry : fallseaRegistryConfig
```

# 客户端
> 启动类  MotanClientWeb  
客户端测试地址：http://localhost:8080/hello/fallsea
> 配置说明，详细配置请参考[配置清单](https://github.com/weibocom/motan/wiki/zh_configuration)

```
fallsea : 
    motan : 
        #注册中心配置
        registry : 
            regProtocol : zookeeper #注册中心协议
            address : 127.0.0.1:2181 #注册中心地址
            requestTimeout : 1000 #注册中心连接超时时间(毫秒)
            connectTimeout : 3000 #注册中心请求超时时间(毫秒)
        #协议配置
        protocol : 
            name : motan #协议名称
            minWorkerThread : 20 #最小工作pool线程数
            maxWorkerThread : 50 #最大工作pool线程数
            filter : statistic
        #指定需要解析的包名
        annotation :
            package : com.fallsea.demo
        #客户端配置
        client : 
            protocol : fallseaMotan
            group : fallsea
            check : false
            requestTimeout : 3000 #请求超时时间(毫秒)
            connectTimeout : 5000 #连接超时时间(毫秒)
            registry : fallseaRegistryConfig
```
