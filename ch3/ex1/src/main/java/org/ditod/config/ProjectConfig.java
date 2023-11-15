package org.ditod.config;

import org.ditod.Parrot;
import org.ditod.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ProjectConfig {
    @Bean
    Parrot parrot() {
        Parrot p = new Parrot();
        p.setName("bird");
        return p;
    }

    @Bean
    Person person() {
        Person p = new Person();
        p.setName("pedro");
        return p;
    }
}
