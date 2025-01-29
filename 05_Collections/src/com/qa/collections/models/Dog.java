package com.qa.collections.models;

public class Dog extends Pet {


    public Dog(String name, int age, String colour) {
        super(name, age, colour);
    }

    @Override
    public String makeNoise() {
        return "Woof woof";
    }


}
