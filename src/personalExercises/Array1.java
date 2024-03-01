package personalExercises;

import java.util.ArrayList;
import java.util.Arrays;

public class Array1 {
    public static void main(String[] args) {
        int[] array = {2,4,5,6,7,8};
        ArrayList<Integer>nums = new ArrayList<>();
        for (int j : array) {
            if (j % 2 == 0) {
                nums.add(j);
            }
        }
        System.out.println(nums);
    }

}
