package com.strr.consumer.controller;

import com.strr.service.HelloService;
import org.apache.dubbo.config.annotation.DubboReference;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
    @DubboReference
    private HelloService helloService;

    @GetMapping("/hello")
    public String hello() {
        logger.info(helloService.hello());
        return "dubbo-consumer:hello!";
    }
}
