package com.example.tripadvisor.client;

import org.springframework.boot.web.client.RestTemplateBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class AgencyServiceClient {
    @Bean
    public RestTemplate generateRestTemplate(RestTemplateBuilder builder){
        return builder.build();
    }
}
