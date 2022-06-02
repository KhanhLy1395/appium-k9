package lesson_04;

import java.security.SecureRandom;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class lab_05_01 {

    public static void main(String[] args) {

        System.out.println("Please select a number:");
        System.out.println("1. Add number into ArrayList");
        System.out.println("2. Print numbers");
        System.out.println("3. Get maximum number");
        System.out.println("4. Get minimum number");

        Scanner scanner = new Scanner(System.in);

        int selectNumber = scanner.nextInt();
        List<Integer> number = new ArrayList<>();
        number.add(3);
        number.add(5);
        switch (selectNumber) {
            case 1:
                System.out.println("Please add 3 number: ");
                int addNumberTime = 0;
                do {
                    number.add(scanner.nextInt());
                    addNumberTime++;
                } while (addNumberTime < 3);
                break;
            case 2:
                System.out.println("Print numbers");

                for (int i = 0; i < number.size(); i++) {
                    System.out.print(number.get(i) + " ");
                }
                break;
            case 3:
                System.out.println("Get maximum number");
                int maxNumber = number.get(0);
                for (int i = 0; i < number.size(); i++) {
                    if (maxNumber < number.get(i)){
                        maxNumber = number.get(i);
                    }
                }
                System.out.println("Maximum number is : " + maxNumber);
                 break;
            case 4:
                System.out.println("Get minimum number");
                int minNumber = number.get(0);
                for (int i = 0; i < number.size(); i++) {
                    if (minNumber > number.get(i)){
                        minNumber = number.get(i);
                    }
                }
                System.out.println("Minimum number is: " + minNumber);
                break;
            default:
        }
    }
}
