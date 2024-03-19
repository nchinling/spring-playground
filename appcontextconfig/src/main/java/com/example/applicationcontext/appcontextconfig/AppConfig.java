package com.example.applicationcontext.appcontextconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public HelloWorld helloWorld() {
        HelloWorld helloWorld = new HelloWorld();
        helloWorld.setMessage("Hello World!");
        return helloWorld;
    }

    @Bean
    public Car car() {
        Car car = new Car();
        car.setBrand("Toyota Crown");
        car.setColour("Black");
        return car;
    }
}