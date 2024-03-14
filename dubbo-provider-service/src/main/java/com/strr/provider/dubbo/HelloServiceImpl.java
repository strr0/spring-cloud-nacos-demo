package com.strr.provider.dubbo;

import com.strr.service.HelloService;
import org.apache.dubbo.config.annotation.DubboService;

@DubboService
public class HelloServiceImpl implements HelloService {
    @Override
    public String hello() {
        return "dubbo-provider:hello!";
    }
}
