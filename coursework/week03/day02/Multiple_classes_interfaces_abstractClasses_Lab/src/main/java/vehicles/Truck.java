package vehicles;

import uses.Purpose;

public class Truck extends Vehicle implements Purpose {
    public Truck(String registration, String brand, String problem) {
        super(registration, brand, problem);
    }

    @Override
    public String use() {
        return "Mostly for transporting heavy goods";
    }
}
