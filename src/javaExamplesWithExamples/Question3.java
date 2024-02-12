package javaExamplesWithExamples;

import java.util.ArrayList;

import static javaExamplesWithExamples.Example.toArray;

public class Question3 {


    public static int[] arraySum(int[] array) {

        ArrayList <Integer> sum = new ArrayList<>();
        for(int i = 0; i < array.length; i++){
            sum.add(array[i]);
        }
        return toArray(sum);
    }

    public static int[] toArray(ArrayList<Integer> sum){
        int [] array = new int[sum.size()];
        for(int count = 0; count < sum.size(); count++){
            array[count] = sum.get(count);
        }
        return  array;
    }
}
