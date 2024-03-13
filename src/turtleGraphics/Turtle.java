package turtleGraphics;

public class Turtle {

    private  boolean isPenup = true;
    private final Direction currentDirection = Direction.EAST;
    public boolean isPenUp() {
        return isPenup;
    }

    public void penUp() {
        isPenup = true;
    }

    public void penDown() {
        isPenup = false;
    }

    public Direction checkCurrentDirection() {
        return currentDirection;
    }

    public void turnLeft() {
        currentDirection.moveLeft();
    }
    public void turnRight(){
        currentDirection.moveRight();
    }
}
