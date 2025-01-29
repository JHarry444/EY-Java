package com.qa;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.InputMismatchException;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // Scanner reads input from the console
        try (Scanner scanner = new Scanner(System.in)) {
            Integer num = null;
            do {
                try {
                    System.out.println("Please enter a number:");

                    num = scanner.nextInt();

                } catch (InputMismatchException ime) {
                    // will ONLY run if the InputMismatchException is thrown INSIDE the try block
                    System.out.println("Invalid number");
                    scanner.nextLine();
                }
            } while (num == null);
            System.out.println("Your number was: " + num);
        }
        // closes the scanner to avoid wasting memory
    }
}
