package com.alvis.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @author Alvis
 * @date 2020/6/28 19:22
 */
@SpringBootApplication
@EnableDiscoveryClient //该注解用于向使用consul或者zookeeper作为注册中心时的注册服务
public class OrderConsulMainn80 {
    public static void main(String[] args) {
        SpringApplication.run(OrderConsulMainn80.class, args);
    }
}