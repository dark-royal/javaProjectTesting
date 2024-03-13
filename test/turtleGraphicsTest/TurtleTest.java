package turtleGraphicsTest;

import org.junit.jupiter.api.Test;
import turtleGraphics.Direction;
import turtleGraphics.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {
    @Test
    public void testPenIsUp(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testPenIsDown(){
        Turtle turtle = new Turtle();
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testPenCanUp(){
    Turtle turtle = new Turtle();
    assertTrue(turtle.isPenUp());
    turtle.penDown();
    assertFalse(turtle.isPenUp());
    turtle.penUp();
    assertTrue(turtle.isPenUp());

}

    @Test
    public void testTurtleCanTurnLeft(){
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST,turtle.checkCurrentDirection());

    }
    @Test
    public void testTurtleCanTurnLeftFromEast_turnedToNorth(){
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST,turtle.checkCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH,turtle.checkCurrentDirection());

    }
    @Test
    public void testTurtleCanTurnLeftFromNorth_turnedToWest() {
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnLeftFromWest_turnedToSouth() {
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnLeftFromSouth_turnedToEast(){
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnRightFromEast_turnedToSouth(){
        Turtle turtle = new Turtle();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.checkCurrentDirection());



    }



}
