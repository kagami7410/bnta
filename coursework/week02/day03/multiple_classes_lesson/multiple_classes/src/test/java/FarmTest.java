import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class FarmTest {
    Farm farm;
    Chicken chicken;
    List<Chicken> chickens;

    public void setup(){
        farm = new Farm("Happy Farm", chickens, 0);
    }

    @Test
    public void getEggsForSale(){
        Farm.setEggsForSale(3);
        assertThat(getEggsForSale()).isEqualsTo(4);
    }

    @Test
    public void canAddChickenToFarm(){
        farm.addChicken(chicken);
        assertThat(farm.getChickens().size()).isEqualTo(1);
    }

    @Test
    public void canSetEggsForSale(){
        farm.setEggsForSale(3);
        assertThat(farm.getEggsForSale()).isEqualTo(3);
    }
}
