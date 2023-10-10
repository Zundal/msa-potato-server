package com.service.apigate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class ApiGateApplication {

    public static void main(String[] args) {
        SpringApplication.run(ApiGateApplication.class, args);
    }

}
