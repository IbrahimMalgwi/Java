package tdd;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import tdd.SimpleCalculator;

import static org.junit.jupiter.api.Assertions.*;

class SimpleCalculatorTest {
    SimpleCalculator calculator;

    @BeforeEach
    public void setUp(){
         calculator = new SimpleCalculator();
    }

    @Test
    public void addTwoNumbersCalculateResultTest(){
//        Given that I have a calculator
//        When I add two numbers 2 + 2
//        Check that result is 4
        SimpleCalculator calculator = new SimpleCalculator();
        calculator.add(2, 2);
        assertEquals(4, calculator.add(2, 2));
    }

    @Test
    public void addTwoNumberAndWrognResultTest(){
//        Given that I have a calculator
//        When I add two numbers and get wrong result 3 + 2
//        Check result not equals 5
        calculator.add(3, 2);
        assertNotEquals(6, calculator.add(3, 2));
    }

    @Test
    public void addSevenAndThreeResultEqualsTen(){
//        Given that I have a calculator
//        When I add two numbers 7 and 3
//        Check that result is 10
        calculator.add(7, 3);
        assertEquals(10, calculator.add(7, 3));
    }

    @Test
    public void multiplyTwoNumbersResultTrueTest(){
//        Given that I have a calculator
//        When I multiply two numbers 2 and 3
//        Check that result is 6
        calculator.mult(2, 3);
        assertEquals(6, calculator.mult(2, 3));
    }

    @Test
    public void divideTwoNumbersResultTrueTest(){
//        Given that I have a calculator
//        When I divide two numbers 4 and 2
//        Check that result is 2
        calculator.div(2, 3);
        assertEquals(2, calculator.div(4, 2));
    }

    @Test
    public  void subractANumberFromAnotherNumberTest(){
//        Given taha I have a calculator
//        When I subtract a number from another 6 - 2
//        Check that result is 2
        calculator.sub(6, 2);
        assertEquals(4, calculator.sub(6,2));
    }


}