package com.demo.serviceribbon.controller;


import com.demo.serviceribbon.service.HelloService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class HelloController {

    @Autowired
    HelloService helloService;


    @RequestMapping("/hi")
    public String hi(String name){

         return helloService.hiService(name);

    }



}
