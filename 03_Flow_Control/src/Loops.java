import java.util.Scanner;

public class Loops {

    public static void main(String[] args) {
        // for (start, stop, increment)
        // i = i + 1 -> i += 1 -> i++
        // for loops are for when you know how many iterations you are doing
        for (int i = 0; i < 10; i++) {
            System.out.println("I: " + i);
        }

        // while
        // a loop until the condition is false
        Scanner scanner = new Scanner(System.in);
        int num = 5;

        while (num > 10 || num < 1) {
            System.out.println("Please enter a number from one to ten");
            num = scanner.nextInt();
        }

        System.out.println("Your number was: " + num);
        // do while
        do {
            System.out.println("Please enter a number from one to ten");
            num = scanner.nextInt();
        } while (num > 10 || num < 1);
    }
}
