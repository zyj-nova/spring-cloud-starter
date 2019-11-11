package com.nefu.springcloud.consumerfeign.hystrix;

import com.nefu.springcloud.consumerfeign.service.AdminService;
import org.springframework.stereotype.Component;

@Component
public class AdminHystrix implements AdminService {

    @Override
    public String sayHi(String msg) {
        return "BAD REQUEST! The internal server ERRO! " + msg;
    }
}
