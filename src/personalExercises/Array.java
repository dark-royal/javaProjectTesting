package personalExercises;

import java.util.Arrays;

public class Array {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 6, 7, 8, 9, 12};//[13,,,,,,,,,1]
        int first = 0;
        int last = array.length-1;
while (first < last){
    int temp = array[first];
    array[first] = array[last];
    array[last] = temp;
//    array[first] += array[last];
//    array[last] = array[first] - array[last];
//    array[first] = array[first] - array[last];
    last--;
    first++;
} //
//        [2,4,5,6,7,8]
//        [4,6,8]

        // "i love you" // remove vowels // lv y

//

        System.out.println(Arrays.toString(array));

    }

    }

//        public static int[] reverseArray(int[] array) {
//
//
//
//    }


//        int[] que = {9, 8, 7, 6, 2, 5, 1, 3};
        //int[] que = {2, 4, 8,9,12};

//        for(int i = 0; i < que.length;i++){
//            for (int j = 0; j < i; j++) {
//                if (que[i] < que[j]){
//                    int temp = que[i];
//                    que[i] = que[j];
//                    que[j] = temp;
//                }
//            }
//        }

        //[1234567890]
        //[0987654321]

//        for (int i = 0; i < que.length-1; i+=2) {
//                    int temp = que[i]; //2
//                    que[i] = que[i+1];
//                    que[i+1] = temp;
//        }
//
//        System.out.println(Arrays.toString(que));
//    }



