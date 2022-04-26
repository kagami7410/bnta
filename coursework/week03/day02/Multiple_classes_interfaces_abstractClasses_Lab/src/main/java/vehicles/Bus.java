package vehicles;

import uses.Purpose;

public class Bus extends Vehicle implements Purpose {
    public Bus(String registration, String brand, String problem) {
        super(registration, brand, problem);
    }

    @Override
    public String use() {
        return "Mainly for transporting public";
    }
}
