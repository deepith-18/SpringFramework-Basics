package com.rc.ex4;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDatas {

    @Bean
    public Sim getSim() {
        return new Sim(6361265164L);
    }

    @Bean
    public Mobile getMobile() {
        return new Mobile(getSim());
    }
}