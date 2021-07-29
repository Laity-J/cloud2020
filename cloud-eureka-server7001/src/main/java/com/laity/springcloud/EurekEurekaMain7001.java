package com.laity.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EurekEurekaMain7001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekEurekaMain7001.class,args);
    }

}
