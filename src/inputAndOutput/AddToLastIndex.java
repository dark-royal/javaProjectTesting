package inputAndOutput;

import java.util.Arrays;

public class AddToLastIndex {
    public static void main(String[] args) {
        int[] number = {2, 4, 0, 9, 9};
        System.out.println(Arrays.toString(addOneToLastIndex(number)));
    }

    public static int[] addOneToLastIndex(int[] number) {
        int last = number.length -1;
        for (int i = 0; i < number.length; i++) {
            number[last] = number[i] + 1;

        }
        return number;
    }
}
