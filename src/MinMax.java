import java.util.ArrayList;
import java.util.Arrays;

public class MinMax {

    public static void main(String[] args) {
        int[] array = {3, 4, 5, 2, 1};
        System.out.println((findMinAndMax(array)));
    }

    public static ArrayList<Integer> findMinAndMax(int[] array) {
        ArrayList<Integer> number = new ArrayList<>();
        int maximum = array[0];
        int minimum = Integer.MAX_VALUE;
        int counter = 0;
        for (int index = 0; index < array.length; index++) {
            for (int index2 = 0; index2 < index; index2++) {
                if (array[index2] != counter) {
                    number.add(array[index2]);
                }


            }

        }

        return number;
    }
}






