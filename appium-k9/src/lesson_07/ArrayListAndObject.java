package lesson_07;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndObject {
    public static void main(String[] args) {
        List<Person> personList = new ArrayList<>();
        // Reference data : khi add 2 entry vao trong array list ma thay doi giá trị thì sẽ thay đổi cả 2 index

        Person teo = new Person();
        teo.setName("Teo");
        teo.setAge(18);

        personList.add(teo);
        personList.add(teo);

        System.out.println(personList);

        personList.get(0).setName("Ti");
        System.out.println(personList);
    }


}
