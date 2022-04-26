package garage;
import RepairTask.Task;
import vehicle.Car;
import vehicle.Vehicle;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Garage {
    List <Vehicle> vehicles;
HashMap<String, ArrayList<Task>> repairLogs= new HashMap<>();
    public Garage(){
        this.repairLogs = new HashMap<>();
        this.vehicles = new ArrayList<>();
    }

    public HashMap getRepairLogs(){
        return repairLogs;
    }
    public ArrayList<Task> getCarRepairLogs(){
        return  repairLogs.get("CarRepairList");

    }

    public void addCar(Car car){
        vehicles.add(car);
    }
}
