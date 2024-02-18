import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MyArrayListTest {

    private MyArrayList myArrayList;

    @BeforeEach
    public void initializer() {
        myArrayList = new MyArrayList(0);
    }

    @Test
    public void myArrayListIsEmptyTest() {
        assertTrue(myArrayList.isEmpty());

    }

    @Test
    public void addElementTheList_elementIsNotEmptyTest() {
        assertTrue(myArrayList.isEmpty());
        myArrayList.add();
        assertEquals(1, myArrayList.getSize());
    }

    @Test
    public void addTwoElements_twoElementAreAddedToTheListTest(){
        //myArrayList.add();
        //assertFalse(myArrayList.isEmpty());
        myArrayList.add();
        myArrayList.add();
        assertEquals(2, myArrayList.getSize());

    }

    @Test
    public void addOneElement_removeOneElementTest(){
        myArrayList.add();
        myArrayList.remove();
        assertEquals(0,myArrayList.getSize());
    }

    @Test
    public void removeElementFromAnArrayList_throwAnException(){
        assertTrue(myArrayList.isEmpty());
        assertThrows(IndexOutOfBoundsException.class,() ->myArrayList.remove());

    }

//    public void addElement_elementIsAdded(){
//        myArrayList.add("praise");
//        myArrayList.add("marvelous");
//    }
}

