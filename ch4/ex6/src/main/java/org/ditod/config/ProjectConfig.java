package org.ditod.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.ditod.proxies", "org.ditod.repositories", "org.ditod.services"})
public class ProjectConfig {
}
