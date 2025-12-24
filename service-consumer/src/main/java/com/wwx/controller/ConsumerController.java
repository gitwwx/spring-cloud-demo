package com.wwx.controller;


import com.wwx.feign.ProviderFeignClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/consumer")
public class ConsumerController {
    
    @Autowired
    private ProviderFeignClient providerFeignClient;
    
    @GetMapping("/feign/hello/{name}")
    public String helloFeign(@PathVariable String name) {
        return providerFeignClient.hello(name);
    }

    @GetMapping("/ping")
    public String ping() {
        return "pong from " + this.getClass().getSimpleName();
    }
}