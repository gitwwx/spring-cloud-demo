package com.wwx.feign;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name = "service-provider")
public interface ProviderFeignClient {
    
    @GetMapping("/provider/hello/{name}")
    String hello(@PathVariable String name);
}