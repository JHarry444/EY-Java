package com.qa.collections;

import com.qa.collections.models.*;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
         String[] names = {"Jordan", "Cameron", "Piers", "Shafeeq"};

        // fori
        for (int i = 0; i < names.length; i++) {
            System.out.println("Name: " + names[i]);
        }

        for (int i = names.length - 1; i >= 0; i--) {
            System.out.println("Name: " + names[i]);
        }
        //foreach
        for (String name : names) {
            System.out.println("Name: " + name);
        }

//        names[0] = 12;
        int[] nums = new int[10];
        System.out.println(nums);
        System.out.println(nums[0]);
        System.out.println(nums[1]);
        System.out.println(nums[2]);
        System.out.println(nums[3]);
        System.out.println(nums[4]);
        System.out.println(nums[5]);
        System.out.println(nums[6]);
        System.out.println(nums[9]);

//        Cat[] cats = {new Cat("Tiddles", 22, "blue"), null};
//
//        Object[] objects = {"Hello", 24, new Cat("Garfield", 33, "Ginger")};
//
//        Pet[] pets = {new Cat("Felix", 22, "black"), new Dog("Rex", 2, "Brown")};
//
//        Flyable[] flyables = { new Bird(), new Plane()};


        ArrayList<String> namesList = new ArrayList<>();
        System.out.println("List: " + namesList);
        namesList.add("Jordan");
        namesList.add("Cameron");
        namesList.add("Piers");
        System.out.println("List: " + namesList);

        System.out.println(namesList.get(0));

        for (int i = 0; i < namesList.size(); i++) {
            System.out.println("Name: " + namesList.get(i));
        }

        for (String name : namesList) {
            System.out.println("Name: " + name);
        }

        // lists only work with objects
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(2);
        numberList.add(4);
        numberList.add(6);
        numberList.add(8);
        numberList.add(10);
        numberList.add(12);
        System.out.println(numberList);




    }
}