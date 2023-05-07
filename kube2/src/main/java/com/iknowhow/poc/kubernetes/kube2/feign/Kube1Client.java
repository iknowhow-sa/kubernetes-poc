package com.iknowhow.poc.kubernetes.kube2.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${app.services.kube1-service}", url = "${app.services.kube1-service-url}")
public interface Kube1Client {

    @RequestMapping(method = RequestMethod.GET, value = "/kube1/hello")
    String greet();
}
