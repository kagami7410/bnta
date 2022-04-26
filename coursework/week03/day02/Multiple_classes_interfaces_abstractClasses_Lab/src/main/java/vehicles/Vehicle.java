package vehicles;

import java.util.ArrayList;
import java.util.List;

public abstract class Vehicle {
    private String registration;
    private String brand;
    private String problem;

    private boolean allfixed;


    public Vehicle(String registration, String brand, String problem) {
        this.registration = registration;
        this.brand = brand;
        this.problem = problem;
        this.allfixed = false;
    }

    public String getRegistration() {
        return registration;
    }

    public String getBrand() {
        return brand;
    }

    public String getProblem() {
        return problem;
    }

    public boolean isAllfixed() {
        return allfixed;
    }

    public void setProblem(String problem) {
        this.problem = problem;
    }

    public void setAllfixed(boolean allfixed) {
        this.allfixed = allfixed;
    }

    public String move(Vehicle vehicle){
        if(vehicle.isAllfixed() == true){
            return "Vehicle is moving";
        }
        else{
            return "Vehicle is still not repaired";
        }
    }


}



