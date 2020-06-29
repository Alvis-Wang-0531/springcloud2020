package com.alvis.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Alvis
 * @date 2020/6/27 10:43
 */
@SpringBootApplication
public class OrderzkMain80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderzkMain80.class, args);
    }
}