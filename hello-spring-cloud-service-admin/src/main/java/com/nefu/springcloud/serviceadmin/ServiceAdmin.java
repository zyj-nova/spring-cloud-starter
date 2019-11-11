package com.nefu.springcloud.serviceadmin;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ServiceAdmin {
    public static void main(String[] args) {
        SpringApplication.run(ServiceAdmin.class,args);
    }
}
