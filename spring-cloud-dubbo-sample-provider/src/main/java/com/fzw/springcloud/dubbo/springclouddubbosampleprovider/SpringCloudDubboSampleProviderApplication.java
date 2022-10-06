package com.fzw.springcloud.dubbo.springclouddubbosampleprovider;

import com.fzw.springcloud.dubbo.IHelloService;
import org.apache.dubbo.config.spring.context.annotation.DubboComponentScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


/*
*
*   sh zkServer.sh start
*   zkCli.cmd -server localhost:2181
*
* */

@DubboComponentScan
@SpringBootApplication
public class SpringCloudDubboSampleProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringCloudDubboSampleProviderApplication.class, args);
    }

}
