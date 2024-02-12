public class FireDrillFive {


    public static int[] doubleLength(int[] array1) {

        int[] newArray = new int[array1.length * 2];
        return newArray;
    }

    public int[] getResult(int[] array1) {

        int[] newArray = new int[array1.length * 2];
        int[] temp = new int[]{array1.length};
        for (int index = 0; index < array1.length; index++) {
            temp[index + array1.length - 1] = array1[index];
            temp[index] = array1[index] * 2;
        }
        return  temp;


        }






    }


