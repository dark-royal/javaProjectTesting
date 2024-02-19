package personalExercises;

import java.util.Arrays;

public class ReverseArray {
    public static void main(String[] args) {

        int [] array= {7,3,8,5};
        System.out.println(Arrays.toString(reversedArray(array)));
    }
    private static int[] reversedArray (int []array){
        int [] newArray =new int[array.length];
        int count = 0;
        for(int i = array.length-1; i>=0; i--){
            newArray[count] = array[i] ;
            count++;
        }

        return newArray;
    }
}
