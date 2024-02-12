package javaExamplesWithExamples;

import java.util.ArrayList;

public class Example {


    public static int[] evenNumbers(int[] array) {

        ArrayList<Integer> even = new ArrayList<>();
        for (int count = 0 ; count < array.length; count++){
            if (array[count] % 2 == 0){
                even.add(array[count]);
            }
        }
        return toArray(even);
    }

    static int[] toArray(ArrayList<Integer> even) {
        int [] array = new int[even.size()];
        for (int count = 0; count < even.size();count++){
            array[count] = even.get(count);
        }
        return array;
    }
}
