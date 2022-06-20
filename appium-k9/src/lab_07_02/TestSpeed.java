package lab_07_02;

import java.util.ArrayList;
import java.util.List;

public class TestSpeed {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal tiger = new Tiger();
        Animal horse = new Horse();

        List<Animal> animalList = new ArrayList<>();

        animalList.add(dog);
        animalList.add(horse);
        animalList.add(tiger);
        Animal winner = animalList.get(0);


        for (int i = 0; i < animalList.size(); i++) {
            if (animalList.get(i).getSpeed() > winner.getSpeed()) {
                winner = animalList.get(i);
            }
        }
        System.out.println("Winner is " + winner.getClass().getSimpleName() + " with speed " + winner.getSpeed());
    }
}
