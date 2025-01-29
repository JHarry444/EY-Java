package com.qa;

import com.qa.models.Dog;
import com.qa.models.Kennel;

public class CreatedException {

    public static void main(String[] args) {
        Kennel kennel = new Kennel();

        kennel.add(new Dog("Rex", 22, "Alsatian"));
        kennel.add(new Dog("Fido", 8, "Bulldog"));
        kennel.add(new Dog("Stephen", 6, "Dachshund"));

        System.out.println(kennel.findDog(2));

        try {
            System.out.println(kennel.findDog("fggfhfh"));
        } catch (DogNotFoundException e) {
            System.out.println(e.getMessage());
        }

    }
}
