import com.kodilla.good.patterns.challenges.Factorial;
import com.kodilla.good.patterns.challenges.MovieStore;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
public class ChallengesTestSuite {

    @Test
    public void calculateFactorialTest () {
        //Given
        Factorial factorial = new Factorial();
        //When
        long result = factorial.calculateFactorial(7);
        //Then
        Assertions.assertEquals(result, 5040);
    }
}
