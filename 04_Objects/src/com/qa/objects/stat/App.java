package com.qa.objects.stat;


import com.qa.objects.pets.Cat;

public class App {

    public static void main(String[] args) {
        Cat c1 = new Cat();
        c1.setName("Felix");

        Cat c2 = new Cat();
        c2.setName("Tiddles");

        System.out.println(c1);
        System.out.println(c2);

        System.out.println(c1.latinName);
        System.out.println(c2.latinName);

        c1.latinName = "Felis Catus II";

        System.out.println(c1.latinName);
        System.out.println(c2.latinName);

        // actually correct way to access static members:

        System.out.println("Latin Name: " + Cat.latinName);
        System.out.println("PI: " + Math.PI);
        System.out.println("2 cubed: " + Math.pow(2, 3));

    }
}
