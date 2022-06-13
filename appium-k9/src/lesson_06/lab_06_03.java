package lesson_06;

public class lab_06_03 {

    public static void main(String[] args) {
        String myStr = "100 minutes";

        String digitStr = myStr.replaceAll("[^0-9]","");
        System.out.println("filter digit: " + digitStr);
    }
}
