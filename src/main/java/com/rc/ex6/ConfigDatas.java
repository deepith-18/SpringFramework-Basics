package com.rc.ex6;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigDatas {

    @Bean
    public Student getStudent() {
        return new Student(101, "Deepith");
    }

    @Bean
    public Book getBook() {
        return new Book("Java Programming", 500);
    }
}