package turtleChibuzo;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleChubozo.Direction;
import turtleChubozo.Position;
import turtleChubozo.Turtle2;

import static org.junit.jupiter.api.Assertions.*;
import static turtleChubozo.Direction.*;


public class Turtle2Test {
    Turtle2 ijapa;

    @BeforeEach
    public void setUp(){
        ijapa = new Turtle2();
    }
    @Test
    public void thereIsATurtle(){
        Turtle2 ijapa = new Turtle2();
        assertNotNull(ijapa);
    }

    @Test
    public void turtleCanMovePenUpTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());
    }

    @Test
    public void turtleCanMOvePenDownTest(){
        ijapa.penUp();
        assertTrue(ijapa.isPenUp());

        ijapa.penDown();
        assertFalse(ijapa.isPenUp());
    }

    @Test
    public void turtleCanTurnRight_whileFacingEastTest(){
        assertEquals(Direction.EAST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingSouthTest(){
        ijapa.turnRight();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnRight_whileFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());

    }

    @Test
    public void turnCanTurnRight_whileFacingNorthTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnRight();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }



    @Test
    public void turtleCanTurnLeft_whileFacingEastTest(){
        assertEquals(EAST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingNorthTest(){
        ijapa.turnLeft();
        assertEquals(NORTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(WEST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingWestTest(){
        ijapa.turnRight();
        ijapa.turnRight();
        assertEquals(WEST, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanTurnLeft_whileFacingSouthTest(){
        ijapa.turnLeft();
        ijapa.turnLeft();
        ijapa.turnLeft();
        assertEquals(SOUTH, ijapa.getCurrentDirection());
        ijapa.turnLeft();
        assertEquals(EAST, ijapa.getCurrentDirection());
    }

    @Test
    public void turtleCanMoveWhileFacingEastTest(){
        assertEquals(new Position(0,0), ijapa.getCurrentPosition());
        ijapa.move(3);
        assertEquals(new Position(0, 3), ijapa.getCurrentPosition());
    }


}
