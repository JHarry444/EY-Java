package com.qa.collections.models;


public class Bird extends Pet implements Flyable {


    @Override
    public String makeNoise() {
        return "Cheep cheep";
    }

    @Override
    public void fly() {
        System.out.println("Flap flap");
    }
}
