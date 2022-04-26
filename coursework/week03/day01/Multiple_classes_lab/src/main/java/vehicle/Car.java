package vehicle;

import RepairTask.Task;

public class Car extends Vehicle {

    public Car(String registration, String brand) {
        super(registration, brand);
    }

    @Override
    public Task repair(){

        return task;
    }

    @Override
    public Task repair(Task task){
        return task;
    }
}
