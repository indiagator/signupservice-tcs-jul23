package com.example.signupservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class SignupserviceApplication {

    public static void main(String[] args) {
        SpringApplication.run(SignupserviceApplication.class, args);
    }

}
