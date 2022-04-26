import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestDog {
    Dog dog;

    @BeforeEach
    void setUp(){
        dog = new Dog("Panda", 4,false);
    }

    @Test
    public void hasName(){
        assertThat(dog.getName()).isEqualTo("Panda");
    }

    @Test
    public void hasAge(){
        assertThat(dog.getAge()).isEqualTo(4);
    }

    @Test
    public void hasIsWorkingBreed(){
        assertThat(dog.getisWorkingBreed()).isEqualTo(false);
    }

    @Test
    public void hasBark(){
        assertThat(dog.bark()).isEqualTo("woof");
    }

    @Test
    public void hasEat(){
        assertThat(dog.eat()).isEqualTo("Panda is eating!");
    }
}
