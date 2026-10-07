package com.rc.ann5;

import org.springframework.beans.factory.annotation.Autowired;

public class Employee {

    private Laptop laptop;

    @Autowired
    public void setLaptop(Laptop laptop) {
        this.laptop = laptop;
    }
    public void work(){
        System.out.println("Working,.....");
    }

    public Laptop getLaptop() {
        return this.laptop;
    }
}
