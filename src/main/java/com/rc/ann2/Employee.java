package com.rc.ann2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Employee {

    @Autowired
    private static Laptop laptop;

    public Employee(Laptop laptop) {
        this.laptop = laptop;
    }

    public Laptop getLaptop() {
        return this.laptop;
    }
}
