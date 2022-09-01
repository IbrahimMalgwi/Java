package dietel.Chapter8.Excersises;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ArrayWithCheifTest {
    @Test
    void arrayTest(){
        int [] a = {11, 21, 3, 7, 60, 8, 10, 19, 18, 43, 57};
        int [] b = new int[34];

        for (int i = 0; i < 11; i ++) {
            assertTrue(b[i] == 0);
        }

        System.arraycopy(a, 0, b, 0, 1);

        for (int i = 0; i < a.length; i++){
            assertEquals(a[i], b[i]);
        }
    }

}