package com.qa.collections.models;

public class Plane implements Flyable {


    @Override
    public void fly() {
        System.out.println("VROOM");
    }
}
