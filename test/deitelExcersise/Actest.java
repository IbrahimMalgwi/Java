import chapterThree.ac.LgAc;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class Actest {
    @Test
    public void testAcCanBeTurnOn() {
        LgAc lg = new LgAc();
       // assertNotNull(lg);
        //when
        lg.isOn();
        assertFalse(lg.isOn());
     lg.setOn();
     //assert
        assertTrue(lg.isOn());

    }
    @Test
    public void testAcCanBeTurnOff() {
        LgAc lg = new LgAc();
        // assertNotNull(lg);
        //when
        lg.setOn();
        //assert
        assertTrue(lg.isOn());

    }
}