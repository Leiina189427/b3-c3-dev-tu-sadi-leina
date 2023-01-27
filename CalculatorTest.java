import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator = new Calculator();

    @Test
    public void testAddition() {
        assertEquals(3, calculator.add(1, 2));
    }

    @Test
    public void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3));
    }

    @Test
    public void testMultiplication() {
        assertEquals(12, calculator.multiply(3, 4));
    }

    @Test
    public void testDivision() {
        assertEquals(3, calculator.divide(6, 2));
    }

    @Test
    public void testPercentage() {
        assertEquals(10, calculator.percentage(50, 20));
    }

    @Test
    public void testSquare() {
        assertEquals(25, calculator.square(5));
    }

    @Test
    public void testSquareRoot() {
        assertEquals(4, calculator.squareRoot(16));
    }

    @Test
    public void testPower() {
        assertEquals(8, calculator.power(2, 3));
    }
}
