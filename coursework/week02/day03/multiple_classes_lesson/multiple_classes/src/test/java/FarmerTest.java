import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class FarmerTest {
    Farmer farmer;
    Farm farm;
    Chicken chicken_Ginger;
    Chicken chicken_Andy;
    Chicken chicken_Goku;



    @BeforeEach
    public void setup(){
        farm.addChicken(chicken_Andy);
        farm.addChicken(chicken_Ginger);
        farm.addChicken(chicken_Goku);
        chicken_Andy = new Chicken("Andy", 6);
        chicken_Goku = new Chicken("Goku" , 8);
        farmer = new Farmer("Kevin");
        farm = new Farm("Lazy Farm",  )

    }

    @Test
    public void canCollectedEgg(){
        assertThat(farmer.collectEggs(farm)).isEqualTo(0);
    }
}
