package airConditioner;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class AirConditionTest {
    private AirConditioner airConditioner;

    @BeforeEach
    public void PowerON(){
        airConditioner = new AirConditioner();
    }

  @Test
    //given that
  public void test_isOn() throws Exception {
      String result = airConditioner.isOn("no");
      Assertions.assertEquals(result, "on");
  }

  @Test
    public void test_isOff() throws Exception {
        String result = airConditioner.isOff("off");
        Assertions.assertEquals(result, "off");
    }

    @Test
    public void test_increaseTemperature() throws Exception {
        int result = airConditioner.increaseTemperature(29);
        Assertions.assertEquals(result, 29);

    }

    @Test
    public void test_decreaseTemperature() throws Exception {
        int result = airConditioner.decreaseTemperature(13);
        Assertions.assertEquals(result, 13);
    }

    @Test
    public void test_maintainTemperatureAtIncreas() {
        int result = airConditioner.maintainTemperatureAtIncrease(45);
        Assertions.assertEquals(result, 30);
    }

}