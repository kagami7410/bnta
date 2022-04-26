package vehicle;
import RepairTask.Task;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String registration;
    private String brand;
    private boolean isworking;
    List<Task> tasks;

    public Vehicle(String registration, String brand){
        this.registration = registration;
        this.brand = brand;
        this.isworking = false;
        tasks = new ArrayList<>();


    }

    public String getRegistration() {
        return registration;
    }

    public String getBrand() {
        return brand;
    }

    public boolean isIsworking() {
        return isworking;
    }

    public List<Task> getTasks() {
        return tasks;
    }

    public abstract Task repair(){

    }

    public abstract repair(Task){

    }
}
