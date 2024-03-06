import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FireDrillThreeTest {
    @Test
    public void test_even_numbers_in_an_array(){
        int[] array = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int[] expected = {2, 12, 8, 6, 8};
        assertEquals(Arrays.toString(expected),FireDrillThree.taskFour(array).toString());
    }

    @Test
    public void test_odd_number_in_an_array(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int[] expected = {3, 7, 9, 13, 9, 17, 5};
        assertEquals(Arrays.toString(expected),FireDrillThree.taskFive(array1).toString());

    }

    @Test
    public void test_sum_off_odd_numbers_in_an_array(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 63;
        assertEquals(expected,FireDrillThree.taskSix(array1));
    }

    @Test
    public void test_sum_of_even_in_an_array(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 36;
        assertEquals(expected,FireDrillThree.taskSeven(array1));
    }

    @Test
    public void test_minimum_of_even_number(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 2;
        assertEquals(expected,FireDrillThree.taskEight(array1));
    }

    @Test
    public void test_maximum_of_even_number(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 12;
        assertEquals(expected,FireDrillThree.taskNine(array1));

    }

    @Test
    public void test_maximum_of_odd_number(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 17;
        assertEquals(expected,FireDrillThree.taskEleven(array1));
    }

    @Test
    public void test_minimum_of_odd_numbers(){
        int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        int expected = 3;
        assertEquals(expected,FireDrillThree.taskTen(array1));

    }
    }




