package com.nefu.springcloud.consumerribbon.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class AdminService {
    @Autowired
    private RestTemplate restTemplate;

    @HystrixCommand(fallbackMethod = "HystrixError")
    public String sayHi(String string){
        return restTemplate.getForObject("http://hello-spring-cloud-service-admin/index/" + string,String.class);
    }

    public String HystrixError(String msg){
        return "BAD REQUEST! The internal server ERRO! " + msg;
    }
}
