package dietel.Chapter3;

import dietel.Chapter3.Calculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    private Calculator calculator;

    @BeforeEach
    public void initialSetUp() {
        calculator = new Calculator();
    }

    @Test
    public void test_addTwoNumbers() {
        int result = calculator.addTwoNumbers(4,2);
        Assertions.assertEquals(result, 6);
    }

    @Test
    public void test_subractTwoNumbers() {
        int result = calculator.subractTwoNumerbs(4,2);
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void test_multiplyTwoNumbers() {
        int result = calculator.multiplyTwoNumbers(4,2);
        Assertions.assertEquals(result, 8);
    }

    @Test
    public void test_dividTwoNumbers() {
        int result = calculator.dividTwoNumbers(4,2);
        Assertions.assertEquals(result, 2);
    }

    @Test
    public void test_dividTwoNumbersWrongNumber() {
        int result = calculator.dividTwoNumbers(4,2);
        Assertions.assertEquals(result, 2);
    }
    // this is my calculator application
}