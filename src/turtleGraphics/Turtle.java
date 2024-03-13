package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private  boolean isPenup = true;
    private  Direction currentDirection = Direction.EAST;
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
        switch (currentDirection){
            case EAST -> currentDirection = Direction.NORTH;
            case NORTH-> currentDirection = WEST;
            case SOUTH -> currentDirection = Direction.EAST;
            case WEST -> currentDirection = Direction.SOUTH;

        }
    }
    public void turnRight(){
        switch (currentDirection){
        case EAST -> currentDirection = Direction.SOUTH;
        case NORTH-> currentDirection = EAST;
        case SOUTH -> currentDirection = Direction.WEST;
        case WEST -> currentDirection = Direction.NORTH;

    }
}}
