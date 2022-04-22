import org.assertj.core.api.AssertionsForClassTypes;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class TestFizzBuzz {


    @Test
    public void fizzBuzz__3_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(3)).isEqualTo("fizz");
    }

    @Test
    public void fizzBuzz__9_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(9)).isEqualTo("fizz");
    }

    @Test
    void fizzBuzz__5_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(5)).isEqualTo("buzz");
    }

    @Test
    void fizzBuzz__15_returns_fizz(){
        assertThat(FizzBuzz.fizzbuzz(15)).isEqualTo("fizzbuzz");
    }

}
