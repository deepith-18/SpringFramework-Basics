package com.rc.ex4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigDatas.class);

        Mobile mobile = context.getBean(Mobile.class);

        mobile.call();
    }
}