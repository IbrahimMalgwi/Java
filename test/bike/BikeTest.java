package bike;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.nio.channels.spi.AbstractInterruptibleChannel;

import static org.junit.jupiter.api.Assertions.*;

public class BikeTest {
    private Bike bike;

    @BeforeEach
    public void bike() {bike = new Bike();}

    @Test
    public void test_bikeOn() {
        bike.isOn();
        assertTrue(bike.isOn());
    }

    @Test
    public void test_bikeOff(){
        bike.isOff();
        assertFalse(bike.isOff());
    }
    @Test
    void testThatBikCanAccelerate(){
        bike.accelerate();
        bike.accelerate();
        assertEquals(21,bike.getSpeed());
    }
    @Test
    void testThatBikeCanDecelerate(){
        bike.deccelerate();
        bike.accelerate();
        bike.deccelerate();
        assertEquals(0, bike.getSpeed());
    }

    @Test
    void accelerationWithGear(){
        bike.increaseGear();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.accelerate();
        bike.increaseGear();
        bike.accelerate();
        bike.accelerate();
        assertEquals(2, bike.getGear());
        assertEquals(23, bike.getSpeed());
    }

}



