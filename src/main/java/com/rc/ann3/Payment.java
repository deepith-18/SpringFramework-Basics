package com.rc.ann3;

import org.springframework.stereotype.Component;

@Component
public class Payment {

    public void makePayment() {
        System.out.println("Payment successful");
    }
}