package vehicles;

import tasks.Task;
import uses.Purpose;

public class Car extends Vehicle implements Purpose {

    public Car(String registration, String brand, String problem) {
        super(registration, brand, problem);
    }


    @Override
    public String use() {
        return "Mostly for Commuting to work";
    }
}
