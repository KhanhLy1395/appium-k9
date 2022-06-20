package lesson_06;

import java.util.Scanner;

public class Lab_06_02 {

    public static void main(String[] args) {
        String myPassword = "password123";
        int inputMaxTime = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.printf("Please input password");
            String userInput = scanner.next();
            if (!userInput.equals(myPassword)) {
                System.out.println("Your password is wrong");
                inputMaxTime++;
            } else {
                System.out.println("Log in successfully!!!");
            }
        } while (inputMaxTime < 3);

    }
}
