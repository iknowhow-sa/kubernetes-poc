package com.iknowhow.poc.kubernetes.kube1.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "${app.services.kube2-service}", url = "${app.services.kube2-service-url}")
public interface Kube2Client {

    @RequestMapping(method = RequestMethod.GET, value = "/kube2/hello")
    String greet();
}
