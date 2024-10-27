package ru.job4j.annotation;

import org.springframework.context.annotation.*;
import org.springframework.core.annotation.Order;

@Configuration
@ComponentScan(basePackages = "ru.job4j.annotation")
@PropertySource("classpath:application.properties")
public class Config {

    @Order(11)
    @Bean
    @Primary
    public Dog getAlfaDog() {
        return new Dog("AlfaDog");
    }

    @Order(3)
    @Bean(name = "SecondDog")
    public Dog getDog() {
        return new Dog("Dog");
    }

    @Bean
    @Order(5)
    public Dog someDog() {
        return new Dog("Dog");
    }
}
