package com.iknowhow.poc.kubernetes.kube1.controllers;

import com.iknowhow.poc.kubernetes.kube1.feign.Kube2Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
@RequestMapping("kube1")
public class HelloController {

    @Autowired
    Kube2Client kube2Client;

    @GetMapping("hello")
    public String getHello(){
        return "Hello from kube1, on: " + Optional.ofNullable(System.getenv("HOSTNAME")).orElse("(unknown host)");
    }

    @GetMapping("greet")
    public String getGreet(){
        return kube2Client.greet();
    }
}
