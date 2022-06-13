package lesson_05;

import java.util.*;

public class RemovingDuplicatedValue {

    public static void main(String[] args) {

        List<Integer> myArrList = new ArrayList<>();
        myArrList.add(1);
        myArrList.add(1);
        myArrList.add(2);
        myArrList.add(3);
        myArrList.add(5);

        /*
        * Lấy 3 giá trị nhỏ nhất không trung lặp trong myArrList
        *
        * */
        //Cach 1
        List<Integer> withouDuplicatedValuesList = new ArrayList<>();
        for (Integer number : myArrList) {
            if (withouDuplicatedValuesList.contains(number)){
                withouDuplicatedValuesList.add(number);
            }
        }
        System.out.println(myArrList);
        System.out.println(withouDuplicatedValuesList);

        // Cach 2: dung SET- vì Set không chứa element duplicated - tự động sort
        Set<Integer> set = new HashSet<>(myArrList);
        myArrList = new ArrayList<>(set);
        System.out.println(myArrList);

        Collections.sort(myArrList);

        // SubList
        List<Integer> first3minValues = withouDuplicatedValuesList.subList(0, 3);
    }
}
