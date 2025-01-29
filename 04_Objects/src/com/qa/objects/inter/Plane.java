package com.qa.objects.inter;

public class Plane implements Flyable {


    @Override
    public void fly() {
        System.out.println("VROOM");
    }
}
