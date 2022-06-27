package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void Bike() {bike = new Bike();}

    @Test
    public void test_isOn() throws Exception {
        String result = bike.isOn("on");
        Assertions.assertEquals(result, "on");
    }

    @Test
    public void test_isOff() throws Exception {
        String result = bike.isOff("off");
        Assertions.assertEquals(result, "off");
    }


    @Test
    public void test_gearOne() throws Exception { //given that i have a bike
        int gearOne = bike.gearOne(1, 17); //Check for gear 1
        Assertions.assertEquals(gearOne, 18); //Validate that gear one runs well
    }

    @Test
    public void test_gearTwo() throws Exception {
        int gearOne = bike.gearTwo(2, 22);
        Assertions.assertEquals(gearOne, 24);
    }

    @Test
    public void test_gearThree() throws Exception {
        int gearThree = bike.gearThree(3, 32);
        Assertions.assertEquals(gearThree, 35);
    }

    @Test
    public void test_gearFour() throws Exception {
        int gearFour = bike.gearFour(4, 43);
        Assertions.assertEquals(gearFour, 47);
    }



}