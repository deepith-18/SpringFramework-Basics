package com.rc.ex5;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDatas {

    @Bean
    public Engine getEngine(){
        return new Engine(1000);
    }

    @Bean
    public Car getCar(){
        return new Car("BMW","White",getEngine());
    }

}
