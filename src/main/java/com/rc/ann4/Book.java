package com.rc.ann4;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Book {

    @Value("1")
    private  int pages;

    public int getPages() {
        return this.pages;
    }
}
