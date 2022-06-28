package airConditioner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class AirConditionerTest {
    @Test

    public void testAirconditionCreation() {
        AirConditioner sharp = new AirConditioner();
        Assertions.assertNotNull(sharp);
    }

    @Test
    public void testAirConditionCanBeOn(){
        AirConditioner sharp = new AirConditioner();
        sharp.turnOn();
        assertTrue(sharp.isOn());
    }

    @Test
    public void testAirConditionCanBeOff(){
        AirConditioner sharp = new AirConditioner();
        sharp.turnOff();
        assertFalse(sharp.isOn());
    }

    @Test
    public void testAirConditionTemperatureCanIncrease(){
        AirConditioner sharp = new AirConditioner();
        sharp.increaseTemp();
        Assertions.assertEquals(18, sharp.getTemperaturep());
    }

    @Test
    public void testAirConditionTemperatureCanDecrease(){
        AirConditioner sharp = new AirConditioner();
        sharp.DecreaseTemp();
        Assertions.assertEquals(17, sharp.getTemperaturep());
    }

    @Test
    public void testTemperatureCantGoBeyound30(){
        AirConditioner sharp = new AirConditioner();
        sharp.increaseTemp();
        Assertions.assertEquals(30, sharp.increaseTemp());
    }

    @Test
    public void testTemperatureCantGoBlow16(){
        AirConditioner sharp = new AirConditioner();
        sharp.DecreaseTemp();
        Assertions.assertEquals(30, sharp.increaseTemp());
    }
}


