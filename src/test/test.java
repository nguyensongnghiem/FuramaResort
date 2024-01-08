package test;

import java.util.Scanner;
import java.util.SequencedCollection;

public class test {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int number1;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number1 = sc.nextInt();
        } while (number1 <= 0);
        System.out.println("Thank you! Got " + number1);
        int number2;
        do {
            System.out.println("Please enter a positive number!");
            while (!sc.hasNextInt()) {
                System.out.println("That's not a number!");
                sc.next(); // this is important!
            }
            number2 = sc.nextInt();
        } while (number2 <= 0);
        System.out.println("Thank you! Got " + number2);
    }
}
