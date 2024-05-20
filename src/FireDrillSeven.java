import java.util.Arrays;

public class FireDrillSeven {

    public static void main(String[] args) {
        int[] array = {2,4,5,8,7,9};
        System.out.println(Arrays.toString(replaceNUmber(array)));
    }
    public static boolean[] replaceNUmber(int[] array) {

        boolean [] array1 = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] % 2 == 1;

        }


        return array1;
    }
}
