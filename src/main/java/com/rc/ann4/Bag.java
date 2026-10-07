package com.rc.ann4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Bag {

    @Value("Indian Tourister")
    private String brand;
    private Book book;

    Bag(Book book) {
        this.book = book;
    }

    public Book getBook(){
        return this.book;
    }
    public String getBrand(){
        return this.brand;
    }
}
