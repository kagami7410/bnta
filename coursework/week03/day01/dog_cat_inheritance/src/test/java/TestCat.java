import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestCat {
    Cat cat;

    @BeforeEach
    void setUp(){
        cat = new Cat("Shure", 2);
    }


    @Test
    public void hasName(){
        assertThat(cat.getName()).isEqualTo("Shure");
    }
    @Test
    public void hasAge(){
        assertThat(cat.getAge()).isEqualTo(2);
    }
    @Test
    public void hasHasMeow(){
        assertThat(cat.meow()).isEqualTo("meow");
    }

    @Test
    public void hasSleep(){
        assertThat(cat.sleep()).isEqualTo("Shure is sleeping!");
    }
}
