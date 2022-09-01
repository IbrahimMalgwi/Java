package classWork;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class FactorsTest {
    Factors factor;

    @BeforeEach
    public void setUp(){
        factor = new Factors();
    }

    @Test
    public void receiveNumberDetermineFactorsReturnFactors(){

        assertEquals(4, Factors.factorial(6));

    }

}