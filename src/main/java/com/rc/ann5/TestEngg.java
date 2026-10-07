package com.rc.ann5;

import org.springframework.stereotype.Component;

@Component
public class TestEngg  extends Employee{

    @Override
    public void work(){
        super.work();
        System.out.println("Working as Test Engineer,.....");
    }
}
