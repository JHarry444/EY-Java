package com.qa.objects;

public class Test {

    public static void main(String[] args) {
        Cat cat = new Cat();

        cat.setName("Tiddles");

        System.out.println(cat.getName());

        System.out.println(cat.toString());
    }
}
