package lesson_02;

import java.util.Scanner;

public class lab_01 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("nhap chieu cao: ");
        float height = scanner.nextFloat();

        System.out.println("nhap can nang: ");
        float weight = scanner.nextFloat();

        float BMI = weight / (height * 2);
        float gainWeight = 18.5f * (height * 2);
        float loseWeight = 24.9f * (height * 2);

        if (BMI <= 18.5){
            System.out.printf("Ban can tang %f can", gainWeight - weight);
        } else if (BMI <=24.9){
            System.out.println("Than hinh chuan");
        } else {
            System.out.printf("Ban can giam %f can", weight - loseWeight);
        }
    }
}
