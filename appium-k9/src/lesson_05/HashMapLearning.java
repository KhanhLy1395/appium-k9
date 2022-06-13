package lesson_05;

import java.util.HashMap;
import java.util.Map;

public class HashMapLearning {

    public static void main(String[] args) {   // RAW type: Map<>
        // Define type: Map<Integer, String>
        Map<Integer, String> emergencyList = new HashMap<>();
        emergencyList.put(113, "Canh sat");
        emergencyList.put(114, "Cuu hoa");
        emergencyList.put(115, "Cap cuu");
        emergencyList.put(116, "Others");
        emergencyList.put(116, "Something else");

        System.out.println(emergencyList.get(113));
        System.out.println(emergencyList.get(117));

        // get all du lieu khong quan tam duplicate
        for (int key : emergencyList.keySet()) {
            System.out.println(emergencyList.get(key));
        }

        emergencyList.replace(116, "116");
        emergencyList.replace(116, "116", "111");

    }
}
