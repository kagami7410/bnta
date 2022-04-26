import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;



public class GalleryTest {
    Gallery gallery;
    Artwork artwork1;
    Artwork artwork2;



    @BeforeEach
    public void setUp(){
        gallery = new Gallery("London Gallery", 0);
        artwork1 = new Artwork("Picasso", "da vinci", 500, 30);
        artwork2 = new Artwork("Great_Painting", "Mr.Painter", 100, 43);
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);

    }

    @Test
    public void hasName(){
        assertThat(gallery.getName()).isEqualTo("London Gallery");
    }

    @Test
    public void canSellArtwork(){
        gallery.soldArtwork(gallery);
        assertThat(gallery.getTill()).isEqualTo(500);
        assertThat(gallery.getArtworks().size()).isEqualTo(0);

    }




}
