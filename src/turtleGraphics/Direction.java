package turtleGraphics;

public enum Direction {
    EAST("NORTH","SOUTH"),
    NORTH("WEST","WEST"),
    WEST("SOUTH","NORTH"),
    SOUTH("WEST","EAST");
    private final String left;
    private final String right;

    Direction(String left, String right){
        this.left = left;
        this.right = right;
    }

    public void moveLeft(){
        Direction.valueOf(this.left);
    }

    public void moveRight(){
        Direction.valueOf(this.right);
    }

}
