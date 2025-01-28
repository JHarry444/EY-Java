package com.qa.objects;

// new type called 'Cat'
public class Cat {

    // has 3 'fields' or values
    private String name;
    private int age;
    private String colour;

    public Cat() {
        // default constructor
        // function (or method) that is used to instantiate an object
    }

    public Cat(String name, int age, String colour) {
        this.setName(name);
        this.setAge(age);
        this.setColour(colour);
    }

    public void setAge(int age) {
        if (age >= 0 && age < 30) {
            this.age = age;
        } else {
            System.out.println("Invalid age: " + age);
        }
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getName() {
        return this.name;
    }

    public int getAge() {
        return this.age;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public String getColour() {
        return colour;
    }
}
