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
        p.setName("koko");
        return p;
    }

    @Bean
    Person person(Parrot parrot) {
        Person p = new Person();
        p.setName("pedro");
        p.setParrot(parrot);
        return p;
    }
}
