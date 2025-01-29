package com.qa.objects.pets;

import com.qa.objects.inter.Flyable;

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
