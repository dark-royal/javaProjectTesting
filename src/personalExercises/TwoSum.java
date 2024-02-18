package personalExercises;

import java.util.Arrays;

public class TwoSum {

//    public static void main(String[] args) {
//        int [] number = {2,7,9,11,6};
//
//        int [] arrayOfIndex = twoSumIndices(number, 11);
//     //   System.out.println(Arrays.toString(arrayOfIndex));

//    public static void main(String[] args) {
//        int[] P = new int[6];
//        System.out.println(P.toString());
//    }
    public static int[] twoSumIndices(int[] nums, int target) {
        int[] arrayOfIndex = new int[2];
        for (int i = 0; i < nums.length -1; i++) {
            for (int j = 0; j < nums.length - 1; j++) {
                if(nums[i] + nums[j + 1] == target){
                    arrayOfIndex[0] = i ;
                    arrayOfIndex[1] = j + 1;
                    System.out.println(Arrays.toString(arrayOfIndex));
                }

            }

        }
        return arrayOfIndex;
    }
}