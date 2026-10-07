package com.rc.ann5;

import org.springframework.stereotype.Component;

@Component
public class Laptop {
    private String brand;

    public String getBrand() {
        return this.brand;
    }
}
