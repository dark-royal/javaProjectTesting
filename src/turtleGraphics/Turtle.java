package turtleGraphics;

import static turtleGraphics.Direction.*;

public class Turtle {

    private  boolean isPenup = true;
    private  Direction currentDirection = Direction.EAST;
    private Position currentPosition = new Position(0,0);
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
        case NORTH-> currentDirection = Direction.EAST;
        case SOUTH -> currentDirection = Direction.WEST;
        case WEST -> currentDirection = Direction.NORTH;

    }
}

    public Position getCurrentPosition() {
        return currentPosition;
    }


    public void moveForward(int numberOfSteps,SketchPad sketchPad) {
        if(!isPenUp()) drawOnBoard(sketchPad,numberOfSteps);
        switch (currentDirection) {
            case EAST -> moveforwardFacingEast(numberOfSteps);
            case SOUTH -> moveforwardFacingSouth(numberOfSteps);
            case WEST -> moveForwardFacingWest(numberOfSteps);
            case NORTH -> moveforwardFacingNorth(numberOfSteps);
        }
    }

    private void drawOnBoard(SketchPad sketchPad, int numberOfSteps) {


    }

    private void moveforwardFacingNorth(int numberOfSteps) {
        int newRow = currentPosition.getColumn() + numberOfSteps - 1;
        int newColumn = currentPosition.getRow();
        currentPosition = new Position(newRow,newColumn);


    }

    private void moveForwardFacingWest(int numberOfSteps) {
        int newRow = currentPosition.getRow() + numberOfSteps - 1;
        int newColumn = currentPosition.getColumn();
        currentPosition = new Position(newRow,newColumn);

    }

    private void moveforwardFacingSouth(int numberOfSteps) {
        int newRow = currentPosition.getRow() + numberOfSteps - 1;
        int newColumn = currentPosition.getColumn();
        currentPosition = new Position(newRow,newColumn);

    }

    private void moveforwardFacingEast(int numberOfSteps) {
        currentPosition.setColumn(currentPosition.getRow() + numberOfSteps -1);
    }
}
