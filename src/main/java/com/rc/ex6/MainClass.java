package com.rc.ex6;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainClass {

    public static void main(String[] args) {

        ApplicationContext context =
                new AnnotationConfigApplicationContext(ConfigDatas.class);

        Student student = context.getBean(Student.class);

        Book book = context.getBean(Book.class);

        // Setter injection
        student.setBook(book);

        student.display();
    }
}