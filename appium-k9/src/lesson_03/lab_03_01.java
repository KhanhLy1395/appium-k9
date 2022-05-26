package lesson_03;

public class lab_03_01 {

    public static void main(String[] args) {
        int[] intArr = {1, 2, 3, 4, 5};
        int evenNumber = 0;
        int oddNumber = 0;

        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] % 2 == 0) {
                evenNumber = evenNumber + 1;
            } else {
                oddNumber = oddNumber + 1;
            }
        }
        System.out.println("count even number: " + evenNumber);
        System.out.println("count odd number: " + oddNumber);
    }
}
