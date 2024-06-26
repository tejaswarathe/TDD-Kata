import org.example.StringCalculator;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    StringCalculator stringCalculator = new StringCalculator();

    @Test
    void addTest() {
        assertEquals(0, stringCalculator.add(","));
        assertEquals(2, stringCalculator.add("1,1"));
        assertEquals(5, stringCalculator.add("1\n4"));
    }

}
