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
        cat1.name = "Felix";
        cat1.age = 12;
        cat1.colour = "Black and white";


        Cat cat2 = new Cat();
        cat2.name = "Garfield";
        cat2.age = 23;
        cat2.colour = "Ginger";

        Cat cat3 = new Cat();

        Cat cat4 = new Cat("Tiddles", 8, "Blue");

        System.out.println("Name: " + cat1.name + " Age: " + cat1.age + " Colour: " + cat1.colour);
        System.out.println("Name: " + cat2.name + " Age: " + cat2.age + " Colour: " + cat2.colour);
        System.out.println("Name: " + cat3.name + " Age: " + cat3.age + " Colour: " + cat3.colour);
        System.out.println("Name: " + cat4.name + " Age: " + cat4.age + " Colour: " + cat4.colour);

        cat4.breed = "Russian Shorthair";

    }
}