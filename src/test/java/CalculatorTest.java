import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTest {

    @Test
    void testAddMe() {
        double result = Calculator.addMe(10, 5);
        assertEquals(15, result);
    }

    @Test
    void testSubMe() {
        double result = Calculator.subMe(10, 5);
        assertEquals(5, result);
    }

    @Test
    void testAddMeWithDecimals() {
        double result = Calculator.addMe(2.5, 1.5);
        assertEquals(4.0, result);
    }

    @Test
    void testSubMeWithDecimals() {
        double result = Calculator.subMe(5.5, 2.0);
        assertEquals(3.5, result);
    }
}