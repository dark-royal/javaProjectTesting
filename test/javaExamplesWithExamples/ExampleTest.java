package javaExamplesWithExamples;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ExampleTest {


    @Test
    public void testSomething(){
        int [] array = {6,9,3,4,6,2};
        int [] outputArray = {6,4,6,2};
        assertArrayEquals(outputArray,Example.evenNumbers(array));
    }

}