package lesson_03;

public class lab_03_02 {

    public static void main(String[] args) {

        int[] intArr = {1, 2, 3, 4, 5};

        int minNumber = intArr[0];
        int maxNumber = intArr[0];
        for (int i = 0; i < intArr.length; i++) {
            if (intArr[i] < minNumber ){
                minNumber = intArr[i];
            } else if (intArr[i] > maxNumber) {
                maxNumber = intArr[i];
            }
        }
        System.out.println("Max number is:" + maxNumber);
        System.out.println("Min number is: " + minNumber);
    }
}
