import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

public class MyStackTest {
    private MyStack myStack;

    @BeforeEach
    public void setMyStack(){
        myStack = new MyStack(5);
    }

    @Test
    public void newStackIsEmpty(){
        assertTrue(myStack.isEmpty());
    }

    @Test
    public void addA_myStackIsNotEmpty(){

        assertTrue(myStack.isEmpty());
        myStack.push(3);
        assertFalse(myStack.isEmpty());
    }

    @Test
    public void addA_removeA_myStackIsEmpty(){
        MyStack myStack = new MyStack(4);
        myStack.push(4);
        myStack.pop();
        assertTrue(myStack.isEmpty());

    }

    @Test
    public void addAB_removeA_myStackIsNotEmpty(){
        myStack.push(4);
        myStack.push(3);
        myStack.pop();
        assertFalse(myStack.isEmpty());
    }



    @Test
    public void popEmptyStack_throwExceptionTest(){
        assertTrue(myStack.isEmpty());
        assertThrows(IllegalArgumentException.class,()-> myStack.pop());
    }

    @Test
    public void pushMoreThanListSize_throwExceptionTest(){
        assertTrue(myStack.isEmpty());
        myStack.push(5);
        myStack.push(4);
        myStack.push(3);
        myStack.push(2);
        myStack.push(1);

        assertThrows(StackOverflowError.class, () -> myStack.push(5));
    }

    @Test
    public void pushFourList_lookAtTheObjectAtTheTopOfTheStackTest() {
        assertTrue(myStack.isEmpty());
        myStack.push(3);
        myStack.push(2);
        myStack.push(4);
        assertEquals(4, myStack.peek());
    }



    @Test
    public void getPeek_whenStackIsEmpty(){
            assertTrue(myStack.isEmpty());
            assertThrows(IllegalArgumentException.class,()-> myStack.peek());

        }








    }


    
