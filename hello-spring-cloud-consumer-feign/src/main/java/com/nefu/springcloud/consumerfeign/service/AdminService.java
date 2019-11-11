package com.nefu.springcloud.consumerfeign.service;

import com.nefu.springcloud.consumerfeign.hystrix.AdminHystrix;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(value = "hello-spring-cloud-service-admin",fallback = AdminHystrix.class)
public interface AdminService {

    @GetMapping("index/{message}")
    String sayHi(@PathVariable("message") String msg);
}
