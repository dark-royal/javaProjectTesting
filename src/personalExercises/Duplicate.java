package personalExercises;


import java.util.ArrayList;

public class Duplicate {
    //public static void main(String[] args) {
        //[2, 9, 2, 1, 7, 1, 5]
        //[2, 1, 2, 1, 1]

        //[2, 7, 6, 4, 0]
        //[1, 2, 7, 2,
        //
        // 0]
        //[2, 7, 0]




   // }

    public static String removeDuplicate(int[] array){
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int j : array) {

            if (!numbers.contains(j)){
                numbers.add(j);
            }



        }
        return numbers.toString();

            }

        }






