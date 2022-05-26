package lesson_02;

import java.util.Scanner;

public class lab_02 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please input a number: ");
        int inputNumber = scanner.nextInt();

        if (inputNumber % 2 ==0) {
            System.out.printf("Number %d is Even number", inputNumber);
        } else {
            System.out.printf("Number %d is Odd number", inputNumber);
        }
    }
}
