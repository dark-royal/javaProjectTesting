public class FireDrillSeven {
    public static boolean[] replaceNUmber(int[] array) {

        boolean [] array1 = new boolean[array.length];

        for (int i = 0; i < array.length; i++) {
            array1[i] = array[i] % 2 == 1;

        }


        return array1;
    }
}
