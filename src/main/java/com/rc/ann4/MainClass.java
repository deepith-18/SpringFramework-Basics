package com.rc.ann4;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {
    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        Bag bag =  context.getBean(Bag.class);
        System.out.println("Bag brand : "+bag.getBrand()+"and Book pages : "+bag.getBook().getPages());
    }
}
