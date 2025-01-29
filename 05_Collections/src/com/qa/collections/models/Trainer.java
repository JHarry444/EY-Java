package com.qa.collections.models;

import java.util.Objects;

public class Trainer {

    private String name;
    private int age;
    private String specialism;

    public Trainer(String name, int age, String specialism) {
        this.name = name;
        this.age = age;
        this.specialism = specialism;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Trainer trainer = (Trainer) o;
        return age == trainer.age && Objects.equals(name, trainer.name) && Objects.equals(specialism, trainer.specialism);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, specialism);
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

    public String getSpecialism() {
        return specialism;
    }

    public void setSpecialism(String specialism) {
        this.specialism = specialism;
    }

    @Override
    public String toString() {
        return "Trainer{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", specialism='" + specialism + '\'' +
                '}';
    }
}
