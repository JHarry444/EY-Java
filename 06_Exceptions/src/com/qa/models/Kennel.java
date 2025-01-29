package com.qa.models;

import com.qa.DogNotFoundException;

import java.util.ArrayList;

public class Kennel {
    private ArrayList<Dog> dogs = new ArrayList<>();



    public boolean add(Dog dog) {
        return this.dogs.add(dog);
    }

    public Dog findDog(int index) {
        return this.dogs.get(index);
    }

    public Dog findDog(String name) throws DogNotFoundException {
        for (Dog dog : this.dogs) {
            if(dog.getName() == name) {
                return dog;
            }
        }

        throw new DogNotFoundException("No dog found with name: " + name);
    }
}
