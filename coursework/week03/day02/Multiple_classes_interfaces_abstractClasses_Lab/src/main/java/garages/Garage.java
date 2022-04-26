package garages;


import tasks.Task;
import vehicles.Brand;
import vehicles.Vehicle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garage implements Task {
    List <Vehicle> vehicles;
    List <Vehicle> repairLogs;
    HashMap<Brand, Vehicle> vehicleLists;

    public Garage(){
        this.repairLogs = new ArrayList<>();
        this.vehicles = new ArrayList<>();
        this.vehicleLists = new HashMap<>();
    }

    public List<Vehicle> getVehicles() {
        return vehicles;
    }

    public List<Vehicle> getRepairLogs(){
        return repairLogs;
    }

    public HashMap<Brand, Vehicle> getVehicleLists() {
        return vehicleLists;
    }

    public void addVehicle(Vehicle vehicle){
        vehicles.add(vehicle);
        switch (vehicle.getBrand()){
        case "Mercedes":
            vehicleLists.put(Brand.MERCEDES, vehicle );
            break;

            case "BMW":
                vehicleLists.put(Brand.BMW, vehicle);
                break;

            case "Hyundai":
                vehicleLists.put(Brand.HYUNDAI,vehicle);
                break;

            case "Ford":
                vehicleLists.put(Brand.FORD, vehicle);
                break;

            case "Toyota":
                vehicleLists.put(Brand.TOYOTA, vehicle);
                break;

        }


    }

    public Vehicle getVehicleByBrand(String brand){
        for(int i = 0; i < vehicles.size(); i++){
            if(vehicles.get(i).getBrand() == brand){
                return vehicles.get(i);
            }
            else{
                return null;
            }
        }
        return null;
    }

    @Override
    public String repair(Vehicle vehicle) {
        repairLogs.add(vehicle);
        vehicles.remove(vehicle);
        vehicle.setAllfixed(true);
        return "Your Vehicle is repaired";
    }


}
