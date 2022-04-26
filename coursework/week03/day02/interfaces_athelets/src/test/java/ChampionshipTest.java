import interfaces.Swimable;
import models.Championship;
import models.Swimmer;
import models.Triathlete;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ChampionshipTest {
    Championship championship;
    Swimable swimmer;
    Triathlete triathlete;

    @BeforeEach
    public void setUp() {
        championship = new Championship("World Athletics");
        swimmer = new Swimmer("John Doe");
        triathlete = new Triathlete("John Cena");
    }

    @Test
    public void canAddSwimmingAthleteToChampionship(){
        championship.addSwimmer(swimmer);
        championship.addSwimmer(triathlete);

        assertThat(championship.getSwimmerCount()).isEqualTo(2);
    }


}
