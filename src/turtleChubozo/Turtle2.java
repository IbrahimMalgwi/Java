package turtleChubozo;
import static turtleChubozo.Direction.*;

public class Turtle2 {
    private boolean isPenUp;
    private Direction currentDirection = EAST;
    private Position currentPosition = new Position(0, 0);

    public void penUp() {
        isPenUp = true;
    }

    public boolean isPenUp() {
        return isPenUp;
    }

    public void penDown() {
        isPenUp = false;
    }

    public Direction getCurrentDirection() {
        return currentDirection;
    }

    public void turnRight(){
        if (currentDirection == NORTH) face(EAST);
        else if (currentDirection == WEST) face(NORTH);
        else if (currentDirection == SOUTH) face(WEST);
        else if (currentDirection == EAST) face(SOUTH);

    }

    private void face(Direction newDirection){
        currentDirection = newDirection;
    }

    public void turnLeft() {
        if (currentDirection == SOUTH) face(EAST);
        else if (currentDirection == WEST) face(SOUTH);
        else if (currentDirection == NORTH) face(WEST);
        else if (currentDirection == EAST) face(NORTH);
    }

    public Position getCurrentPosition() {
        return currentPosition;
    }

    public void move(int noOfSteps) {
        if (currentDirection == EAST) {
            int newColumn = currentPosition.getColumn() + noOfSteps;
                    currentPosition.setColumn(newColumn);
        }
    }
}
