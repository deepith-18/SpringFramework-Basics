package com.rc.ex5;

public class Car {

    private String brand;
    private String color;
    private Engine engine;

    public Car(String brand, String color, Engine engine){
        this.brand = brand;
        this.color = color;
        this.engine = engine;
    }

    public void startEngine(){
        System.out.println("Car Brand is: "+brand);
        System.out.println("Car Color is: "+color);
        System.out.println("Car Engine is: "+engine.getCc());
        System.out.println("Car is ready to start");
    }
}
