package com.qa.objects.inter;

import com.qa.objects.pets.Bird;

public class App {

    public static void main(String[] args) {
        Bird b = new Bird();
        Plane  p = new Plane();

        b.fly();
        p.fly();
    }
}
