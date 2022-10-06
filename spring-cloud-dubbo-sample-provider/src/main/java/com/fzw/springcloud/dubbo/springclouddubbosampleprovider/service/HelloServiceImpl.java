package com.fzw.springcloud.dubbo.springclouddubbosampleprovider.service;

import com.fzw.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.annotation.Service;
import org.springframework.beans.factory.annotation.Value;


/*
 * 一般读操作采取failover策略
 * 增删改采取failfast策略
 * 所以我们通常将读操作单独放到一个接口里去
 * */
//retires 设置服务调用的重试次数
/*
* loadbalance:负载均衡策略
*   roundrobin 轮询
*   randon 权重随机
*
* */
@Service(loadbalance = "roundrobin",cluster = "failover",retries = 2)
public class HelloServiceImpl implements IHelloService {

    @Value("${spring.application.name}")
    private String serviceName;

    @Override
    public String sayHello(String name) {
        return serviceName+":hello "+name;
    }
}
