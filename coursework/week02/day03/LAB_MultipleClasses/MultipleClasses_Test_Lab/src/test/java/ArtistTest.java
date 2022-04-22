import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class ArtistTest {
    Artist artist;
    Artwork artwork1;
    Artwork artwork2;
    List<Artwork>artworks;

    @BeforeEach
    public void setup(){
        artwork1 = new Artwork("painting1", "Ben", 400, 32 );
        artwork2 = new Artwork("painting2", "Picasso", 234, 324);



        artist = new Artist("Ben", artworks );
    }

    @Test public void hasName(){
        assertThat(artist.getName()).isEqualTo("Ben");
    }

    @Test
    public void addArtistArtwork(){
        artist.addArtwork(artwork1);
        assertThat(artwork1.getArtist()).isEqualTo(artist.getName());

    }



}
