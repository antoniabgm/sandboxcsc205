package sandbox.calculator;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    @Test
    void addTwoNumbers() {
        assertEquals(10, Calculator.add(5, 5));
        assertEquals(0, Calculator.add(-5, 5));
        assertEquals(-10, Calculator.add(-5, -5));
    }

    @Test
    void addMultipleNumbers() {
        assertEquals(15, Calculator.add(5, 5, 5));
        assertEquals(5, Calculator.add(5));
        assertEquals(-15, Calculator.add(-5,-5,-5));
    }

    @Test
    void subtract() {
        assertEquals(0, Calculator.subtract(5, 5));
        assertEquals(-10, Calculator.subtract(-5, 5));
        assertEquals(0, Calculator.subtract(0, 0));
    }

    @Test
    void multiply() {
        assertEquals(25, Calculator.multipy(5, 5));
        assertEquals(0, Calculator.multipy(5, 0));
        assertEquals(-25, Calculator.multipy(5, -5));
    }

    @Test
    void divide() {
        assertEquals(1, Calculator.divide(5, 5));
        assertEquals(-1, Calculator.divide(5, -5));
        assertEquals(0, Calculator.divide(0, 5));
    }

    @Test
    void divideByZero() {
        assertThrows(ArithmeticException.class, () -> Calculator.divide(5, 0));
    }
}