package org.ditod.config;

import org.ditod.Parrot;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("Koko");
        return p;
    }

    @Bean
    Parrot parrot1() {
        Parrot p = new Parrot();
        p.setName("Dani");
        return p;
    }
    @Bean
    Parrot parrot2() {
        Parrot p = new Parrot();
        p.setName("Pedro");
        return p;
    }


}
