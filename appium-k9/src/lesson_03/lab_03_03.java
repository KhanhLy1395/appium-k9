package lesson_03;

import java.util.Scanner;

public class lab_03_03 {

    public static void main(String[] args) {
       // Sort an integer array from min to max

        int[] intArr = {12, 34, 1, 16, 28};

        for (int i = 0; i < intArr.length; i++) {
            for (int j = i + 1; j < intArr.length; j++) {
                if (intArr[i] > intArr[j]) {
                    int temp = intArr[i];
                    intArr[i] = intArr[j];
                    intArr[j] = temp;
                }
            }
        }
        for (int i = 0; i < intArr.length; i++) {
            System.out.print(intArr[i] + " ");
        }
    }
}
