package com.nefu.springcloud.serviceadmin.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/index")
public class AdminController {

    @Value("${server.port}")
    String port;
    @GetMapping("/{message}")
    public String index(@PathVariable("message") String msg){
        return "hello:" + msg + ", from:" + port;
    }
}
