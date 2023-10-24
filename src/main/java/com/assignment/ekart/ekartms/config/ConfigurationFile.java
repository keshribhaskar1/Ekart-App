package com.assignment.ekart.ekartms.config;

//import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;


@Configuration
public class ConfigurationFile {

    @Bean
    public RestTemplate restTemplate() {
        return new RestTemplate();
    }

}
