public class FireDrillSix {

    public static int[] replaceNumber(int[] array) {
        for (int j = 0; j < array.length; j++) {
            if (array[j] % 2 == 0) {
                array[j] = 0;

            } else {
                array[j] = 1;
            }

        }
        return array;
    }
}











