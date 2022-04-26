package garages;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import vehicles.Car;
import vehicles.Vehicle;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class GarageTest {

    Garage garage;
    Car car1, car2;
    List<Vehicle> vehicles;
    Vehicle vehicle;

    @BeforeEach
    public void setUp(){
        garage = new Garage();
        car1 = new Car("RE32 RDJ", "Hyundai", "oil leak");
        car2 = new Car("B89 EKD", "BMW", "burned clutch");
        garage.addVehicle(car1);
        garage.addVehicle(car2);

    }

    @Test
    public void canGetProblem(){
        assertThat(garage.getVehicles().get(0).getProblem()).isEqualTo("oil leak");
        System.out.println(garage.getVehicles().get(0).getProblem());

    }

    @Test
    public void canRepairCar(){
        assertThat(garage.getVehicles().size()).isEqualTo(2);
        garage.repair(car1);
        assertThat(garage.getRepairLogs().size()).isEqualTo(1);
        assertThat(garage.getVehicles().size()).isEqualTo(1);
    }

    @Test
    public void canTestMove(){
        garage.repair(car1);
       // assertThat(car1.move(car1)).isEqualTo("Vehicle is still not repaired");
        assertThat(car1.move(car1)).isEqualTo("Vehicle is moving");

    }

    @Test
    public void canGetVehicleByBrand(){
        assertThat(garage.getVehicleByBrand("Hyundai")).isEqualTo(garage.vehicles.get(0));
    }

    @Test
    public void hasUse(){
        assertThat(car1.use()).isEqualTo("Mostly for Commuting to work");
    }

    @Test
    public void hasVehicleList(){
        assertThat(garage.getVehicleLists().size()).isEqualTo(2);
    }


}
