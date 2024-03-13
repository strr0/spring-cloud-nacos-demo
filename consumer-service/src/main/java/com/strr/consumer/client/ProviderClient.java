package com.strr.consumer.client;

import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProviderClient {
    private final RestTemplate restTemplate;

    public ProviderClient(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public String hello() {
        ResponseEntity<String> exchange = restTemplate.exchange("http://provider-service/hello", HttpMethod.GET, null, String.class);
        return exchange.getBody();
    }
}
