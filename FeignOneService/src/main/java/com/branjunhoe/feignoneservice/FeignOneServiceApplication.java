package com.branjunhoe.feignoneservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableFeignClients
@SpringBootApplication
public class FeignOneServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(FeignOneServiceApplication.class, args);
    }

}
