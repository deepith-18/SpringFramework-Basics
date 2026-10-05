package com.rc.ex4;

public class Mobile {

    private Sim sim;

    public Mobile(Sim sim) {
        this.sim = sim;
    }

    public void call() {
        System.out.println(
                "Ready to call by using this sim number: " + sim.getNumber()
        );
    }
}