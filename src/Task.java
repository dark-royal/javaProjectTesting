import java.util.Arrays;

public class Task {
    public static void main(String[] args) {
        int[] number = {1,1,2,2,2};
        System.out.println(Arrays.toString(getOccurrence(number)));
    }



    public static int[] getOccurrence(int[] numbers) {
        for (int index = 0; index < numbers.length; index++){
            for (int i = 0; i < index; i++) {
                if(numbers[index] ==  8){
                    return null;
                }


            }
        }
        return numbers;

    }
}
