import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtworkTest {


    Artwork artwork1;
    Artwork artwork2;

    @BeforeEach
    public void setUp() {
        artwork1 = new Artwork("sick_painting", "Jack", 23, 43);
        artwork2 = new Artwork("painting2", "Cassey", 234, 324);


    }


    @Test
    public void canGetName() {
        assertThat(artwork1.getTitle()).isEqualTo("sick_painting");
    }

    @Test
    public void canGetPrice() {
        assertThat(artwork1.getPrice()).isEqualTo(23);
    }

    @Test
    public void canGetArtist(){
        assertThat(artwork1.getArtist()).isEqualTo("Jack");
    }

    @Test
    public void canGetNft(){
        assertThat(artwork1.getNft()).isEqualTo(43);
    }
}
