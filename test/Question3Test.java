import javaExamplesWithExamples.Question3;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;


public class Question3Test {

    @Test
    public void sumOfArray(){
        int [] array = {1,2,3,4,5,6,};
        int result = 21;
        assertArrayEquals(new int[]{result},Question3.arraySum(array));
    }
}

//outputArray,Example.evenNumbers(array));
//public static int[] evenNumbers(int[] array) {
//
//    ArrayList<Integer> even = new ArrayList<>();
//    for (int count = 0 ; count < array.length; count++){
//        if (array[count] % 2 == 0){
//            even.add(array[count]);
//        }
//    }
//    return toArray(even);