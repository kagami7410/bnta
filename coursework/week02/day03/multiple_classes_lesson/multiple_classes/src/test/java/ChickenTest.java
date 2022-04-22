import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChickenTest {

    Chicken chicken;

    @BeforeEach
    public void setup(){
        chicken = new Chicken("Ginger", 3);
    }

    @Test
    public void hasName(){
        assertThat(chicken.getName()).isEqualTo("Ginger");
    }

    @Test
    public void hasEggs(){
        assertThat(chicken.getEggs()).isEqualTo(3);
    }
}
