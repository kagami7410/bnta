package vehicle;

import RepairTask.Task;

public class Car extends Vehicle implements Task {

    public Car(String registration, String brand, String problem) {
        super(registration, brand, problem);
    }


    @Override
    public String repair() {
        return "Your vehicle is repaired";
    }

    @Override
    public String repair(Task task) {
        return null;
    }
}
