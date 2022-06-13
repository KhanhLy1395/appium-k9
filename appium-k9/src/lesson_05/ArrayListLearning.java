package lesson_05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArrayListLearning {

    public static void main(String[] args) {

        // khi dung cach nay se ko fix so luong list - có thể add - remove - set
        List<Integer> myArrayList = new ArrayList<>();

        // khi dung asList se fix so luong phan tu cua List- không thể add thêm - không thể remove - có thể replace
        List<Integer> myArrayList2 = Arrays.asList(1, 2, 3);

        // CRUD operations
        myArrayList.add(1);
        myArrayList.add(2);

        for (int index = 0; index < myArrayList.size(); index++) {
            System.out.println(myArrayList.get(index)); // lấy ra giá trị của ArrList dùng hàm get()
            System.out.println(myArrayList.remove(0)); // Remove theo index
        }
        System.out.println(myArrayList);

        List<Integer> myArrList = Arrays.asList(1, 2, 3, 4);
        for (int index = 0; index < myArrList.size(); index++) {
            boolean isElementEvenNumber = myArrayList.get(index) % 2 != 0;
            if (isElementEvenNumber){
                myArrList.set(index, myArrayList.get(index) +1);  // để update giá trị mới của index dùng hàm set()
            }
        }



    }
}
