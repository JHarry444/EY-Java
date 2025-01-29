package com.qa.collections.models;

public abstract class Pet extends Object {

    // instance variables -> the value changes between each 'instance'
    private String name;
    private int age;
    private String colour;

    public Pet() {
        super();
    }

    public Pet(String name, int age, String colour) {
        super();
        this.name = name;
        this.age = age;
        this.colour = colour;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getColour() {
        return colour;
    }

    public void setColour(String colour) {
        this.colour = colour;
    }

    public abstract String makeNoise();


    @Override
    public String toString() {
        return "Pet{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", colour='" + colour + '\'' +
                '}';
    }
}
