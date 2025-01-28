package com.qa.objects.pets;

import com.qa.objects.Calculator;

public class App extends Object {

    public static void main(String[] args) {
        Dog dog = new Dog();

        dog.setName("Fido");
        dog.setAge(12);
        dog.setColour("Blonde");

        System.out.println(dog.toString());

        com.qa.objects.Cat cat1 = new com.qa.objects.Cat();
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

        System.out.println(dog.getClass());
        System.out.println(cat1.getClass());

        System.out.println(new Calculator().toString());
        System.out.println(new Calculator().getClass());
    }
}
