package com.strr.consumer.controller;

import com.strr.consumer.client.ProviderClient;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    private final ProviderClient providerClient;

    public HelloController(ProviderClient providerClient) {
        this.providerClient = providerClient;
    }

    @GetMapping("/hello")
    public String hello() {
        logger.info(providerClient.hello());
        return "consumer:hello!";
    }
}
