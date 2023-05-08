package com.iknowhow.poc.kubernetes.kube2.controllers;

import com.iknowhow.poc.kubernetes.kube2.feign.Kube1Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("kube2")
public class HelloController {

    @Autowired
    Kube1Client kube1Client;

    @GetMapping("hello")
    public String getHello(){
        return "Hello from kube2, on: " + Optional.ofNullable(System.getenv("HOSTNAME")).orElse("(unknown host)");
    }

    @GetMapping("greet")
    public String getGreet(){
        return kube1Client.greet();
    }
}
