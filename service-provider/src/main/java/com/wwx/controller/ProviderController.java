package com.wwx.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/provider")
public class ProviderController {
    
    @Value("${server.port}")
    private String port;

    @Value("${custom.message}")
    private String customMessage;
    
    @GetMapping("/hello/{name}")
    public String hello(@PathVariable String name) {
        return "Hello " + name + ", I'm from port: " + port;
    }

    @GetMapping("/config")
    public String getConfig() {
        return customMessage;
    }
}