package turtleGraphicsTest;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import turtleGraphics.Direction;
import turtleGraphics.Position;
import turtleGraphics.SketchPad;
import turtleGraphics.Turtle;

import static org.junit.jupiter.api.Assertions.*;

public class TurtleTest {

    private Turtle turtle;
    private SketchPad sketchPad;

    @BeforeEach
    public void initializer1(){
        sketchPad = new SketchPad();
    }


    @BeforeEach
    public void initializer(){
        turtle = new Turtle();
    }
    @Test
    public void testPenIsUp() {
        assertTrue(turtle.isPenUp());
    }

    @Test
    public void testPenIsDown() {
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
    }

    @Test
    public void testPenCanUp() {
        assertTrue(turtle.isPenUp());
        turtle.penDown();
        assertFalse(turtle.isPenUp());
        turtle.penUp();
        assertTrue(turtle.isPenUp());

    }

    @Test
    public void testTurtleCanTurnLeft() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnLeftFromEast_turnedToNorth() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        assertSame(Direction.NORTH, turtle.checkCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnLeftFromNorth_turnedToWest() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.WEST, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnLeftFromWest_turnedToSouth() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.SOUTH, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnLeftFromSouth_turnedToEast() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        turtle.turnLeft();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());

    }

    @Test
    public void testTurtleCanTurnRightFromEast_turnedToSouth() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnRightFromSouth_turnedToWest() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnRightFromWest_turnedToNorth() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.NORTH, turtle.checkCurrentDirection());


    }

    @Test
    public void testTurtleCanTurnRightFromNorth_turnedToEast() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        turtle.turnRight();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());

    }

    @Test
    public void testTurtleCanMoveForward_toEastPosition(){
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
    }

    @Test
    public void testTurtleCanMoveForward_toSouthPosition(){
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.SOUTH, turtle.checkCurrentDirection());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());

    }

    @Test
    public void testTurtleCanMoveForward_toWestPosition(){
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(Direction.SOUTH,turtle.checkCurrentDirection());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(4,4),turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.checkCurrentDirection());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(8,4),turtle.getCurrentPosition());


    }

    @Test
    public void testTurtleCanMoveForward_toNorthPosition() {
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        assertEquals(new Position(0, 0), turtle.getCurrentPosition());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(0, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(Direction.SOUTH, turtle.checkCurrentDirection());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(4, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertSame(Direction.WEST, turtle.checkCurrentDirection());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(8, 4), turtle.getCurrentPosition());
        turtle.turnRight();
        assertEquals(Direction.NORTH, turtle.checkCurrentDirection());
        //
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(8, 8), turtle.getCurrentPosition());

    }

    @Test
    public void testTurtleCanMoveForward_WhenPenIsDown_toEastPosition(){
        turtle.penDown();
        assertSame(Direction.EAST, turtle.checkCurrentDirection());
        assertEquals(new Position(0,0),turtle.getCurrentPosition());
        assertFalse(turtle.isPenUp());
        turtle.moveForward(5,sketchPad);
        assertEquals(new Position(0,4),turtle.getCurrentPosition());
        int[][] floor = SketchPad.getFloor();
        assertEquals(1,floor[0][0]);
        assertEquals(1,floor[0][1]);
        assertEquals(1,floor[0][2]);
        assertEquals(1,floor[0][3]);
        assertEquals(1,floor[0][4]);
    }





}
