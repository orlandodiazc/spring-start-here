package com.example.ex1.config;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableFeignClients(
        basePackages = "com.example.ex1.proxy")
public class ProjectConfig {
}