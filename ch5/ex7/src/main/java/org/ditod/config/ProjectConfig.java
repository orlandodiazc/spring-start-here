package org.ditod.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {"org.ditod.services, org.ditod.repositories, org.ditod.processors"})
public class ProjectConfig {

}
