import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.List;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;


public class CustomerTest {

    Customer customer;
    Gallery gallery;
    Artwork artwork1;
    Artwork artwork2;

    @BeforeEach
    public void setUp(){
        customer = new Customer("Dan", 1000);
        gallery = new Gallery("London Gallery", 200);
        artwork1 = new Artwork("Picasso", "da vinci", 300, 30);
        artwork2 = new Artwork("Great_Painting", "Mr.Painter", 100, 43);
        gallery.addArtwork(artwork1);
        gallery.addArtwork(artwork2);


    }

    @Test
    public void canGetName(){
        assertThat(customer.getName()).isEqualTo("Dan");

    }
    @Test
    public void canGetWallet(){
        assertThat(customer.getWallet()).isEqualTo(1000);
    }

    @Test
    public void boughtArtwork(){
        customer.boughtArtwork(gallery);
        assertThat(customer.getWallet()).isEqualTo(600);
    }




}
