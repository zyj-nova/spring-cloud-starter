package com.nefu.springcloud.consumerribbon.controller;

import com.nefu.springcloud.consumerribbon.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/info")
public class AdminController {

    @Autowired
    private AdminService service;

    @GetMapping("/{msg}")
    public String getIndex(@PathVariable("msg") String msg){
        return service.sayHi(msg);
    }
}
