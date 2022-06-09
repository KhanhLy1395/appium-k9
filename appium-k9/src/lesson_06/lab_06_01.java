package lesson_06;

import java.util.List;

public class lab_06_01 {


    public static void main(String[] args) {
        String inputTime = "2hrs and 5 minutes";
        int hours = Integer.parseInt(inputTime.substring(0, 1));

        int mins = Integer.parseInt(inputTime.substring(9, 10));

        int totalHours = (hours * 60) + mins;
        System.out.println("Total minute = " + totalHours);

    }
}
