package personalExercise;

import java.util.ArrayList;
import java.util.Arrays;

public class NonsenseTask {

    public static String countArray(int[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        int counter = 0;
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    counter++;
                }
            }
            numbers.add(counter);
            counter = 0;
        }
        int[] array1 = new int[numbers.size()];
        for(int i = 0; i < array1.length; i++){
            array1[i] = numbers.get(i);
        }
        return Arrays.toString(array);

    }

}
