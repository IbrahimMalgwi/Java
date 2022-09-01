package dietel.Chapter8.Excersises;

import Excersises.CalculatePrice;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatePriceTest {

    @Test
    void calculatiionForRangeOneToFourCopiesTest() {
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(4000, price.price(2));
    }

    @Test
    void calculationForRangeFiveToNineCopiesTest(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(10800, price.price(6));
    }

    @Test
    void calcculationForRangeTenToTwentyNineTest(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(17600, price.price(11));
    }

    @Test
    void calculationForRangeFortyToFiftyTest(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(45000, price.price(30));
    }

    @Test
    void calculationForRangeFiftyOneToNinetyNine(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(66300, price.price(51));
    }

    @Test
    void calculationForRangeHundredToOneHundredNinetyNine(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(121200, price.price(101));
    }

    @Test
    void calculationForRangeTwoHundredToFiveHundred(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(222200, price.price(202));
    }

    @Test
    void calculationForFiveHundredAndAbove(){
        CalculatePrice price = new CalculatePrice();
        Assertions.assertEquals(502000, price.price(502));
    }
}
