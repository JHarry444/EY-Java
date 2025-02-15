package com.qa.objects;

public class App {


    public static void main(String[] args) {
        // start

        // Strings get special treatment and don't require 'new'
        // technically called a string literal
        String myName = "Jordan";
        String myName2 = new String("Jordan");

        Cat cat1 = new Cat();
        // . syntax
        cat1.setName("Felix");

//        cat1.age = -12; can no longer access it cos its private
        cat1.setAge(-12);
//        cat1.colour = "Black and white";


        Cat cat2 = new Cat();
        cat2.setName("Garfield");
        cat1.setAge(23);
//        cat2.colour = "Ginger";

        Cat cat3 = new Cat();

        Cat cat4 = new Cat("Tiddles", 88, "Blue");

        System.out.println(cat1.toString());
        System.out.println(cat2.toString());
        System.out.println(cat3.toString());
        System.out.println(cat4);

//        cat4.breed = "Russian Shorthair";

    }
}