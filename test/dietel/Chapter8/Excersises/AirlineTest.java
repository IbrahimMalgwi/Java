package dietel.Chapter8.Excersises;

import Excersises.Airline;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AirlineTest {
    Airline airline;

    @BeforeEach
    void startEachTestWith(){
       airline = new Airline(10);
    }

    @Test
    void testThatAirlineExist(){
        assertNotNull(airline);
    }

    @Test
    void testForSeatsAvailability(){
        airline.getAvailableSeats();
    }

    @Test
    void testSeatCanBeBooked(){
        airline.booking(1);
        airline.booking(1);
        airline.booking(1);
        airline.booking(1);
        airline.booking(2);
        airline.booking(2);
    }


}