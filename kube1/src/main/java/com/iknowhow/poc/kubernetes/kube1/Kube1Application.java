package com.iknowhow.poc.kubernetes.kube1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
@EnableDiscoveryClient
@RibbonClient(name = "kube1-service")
public class Kube1Application {

    public static void main(String[] args) {
        SpringApplication.run(Kube1Application.class, args);
    }

}
