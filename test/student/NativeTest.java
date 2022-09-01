package student;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class NativeTest {
    private Native aNative;

    @BeforeEach
    public void startWith(){
        aNative = new Native();
    }

    @Test
    public void setCohortIdTest(){
        aNative.setCohortID(13);
        assertEquals(0, aNative.getCohortID());
    }

    @Test
    public void layingSCVIDTest(){
        aNative.setCohortID(13);
        System.out.println(aNative.getScvId());
        assertEquals("SCV-UNICORNS0", aNative.getCohortID());
    }

}