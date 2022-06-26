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
    public void test_gearOne() throws Exception {
        int gearOne = bike.gearOne(1, 19);
        Assertions.assertEquals(gearOne, 20);
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


}