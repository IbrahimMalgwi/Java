package chapterThree;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CarApplication {
    @BeforeEach
    void beforeEachTest(){
    }

    @Test
    void testThatCarCanPerformItsCapabilities(){
        Car car= new Car("Bentley 2004", "flying spur", 45);
        Car car1= new Car("SUV", "sports car", 46);

        car.setModel("Bentley 2003");
        car.setPrice(90);
        car.setType("sport car");

        assertEquals(90, car.getPrice());
        assertEquals("Bentley 2003", car.getModel());
        assertEquals("sport car", car.getType());
        assertEquals(46, car1.getPrice());
        car.displayCarPrice(car, 0.05 );
        car1.displayCarPrice(car1,0.07 );


    }


}