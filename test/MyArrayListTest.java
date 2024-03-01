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
        myArrayList.add("praise");
        assertEquals(1, myArrayList.getSize());
    }

    @Test
    public void addTwoElements_twoElementAreAddedToTheListTest(){

        assertTrue(myArrayList.isEmpty());
        myArrayList.add("praise");
        myArrayList.add("marv");
        assertEquals(2, myArrayList.getSize());

    }

    @Test
    public void addOneElement_removeOneElementTest(){
        myArrayList.add("praise");
        myArrayList.remove("praise");
        assertEquals(0,myArrayList.getSize());
    }

    @Test
    public void removeElementFromAnArrayList_throwAnException(){
        assertTrue(myArrayList.isEmpty());
        myArrayList.add("praise");
        assertThrows(IndexOutOfBoundsException.class,() ->myArrayList.remove("praise"));

    }

    public void addElement_elementIsAdded(){
        myArrayList.add("praise");
        myArrayList.add("marvelous");
    }
}

