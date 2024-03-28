public class Task {



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
