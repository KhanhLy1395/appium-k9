package lesson_07;

public class RobotCat {
    private String name;
    private String productionName;

    public RobotCat() {
    }

    public RobotCat(String name, String productionName) {
        this.name = name;
        this.productionName = productionName;
    }

    public String charge(){
       return "Charging";
    }
}
