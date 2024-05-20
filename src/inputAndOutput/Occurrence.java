package inputAndOutput;

import java.util.Arrays;

public class Occurrence {
    public static void main(String[] args) {
        int[] number = {1, 1, 2, 2, 2};
        System.out.println(Arrays.toString(getNumberWhichOccursTheMost(number)));
    }

    public static int[] getNumberWhichOccursTheMost(int[] number) {
        int[] numbers = new int[number.length];
        for (int j : number) {
            numbers[j] = number[j];
            numbers[j]++;

        }
        return numbers;
    }
}
