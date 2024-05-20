package personalExercises;

public class AnotherThing2 {
    public static int[] addOneToLastIndex(int [] number) {
        for (int i = 0; i < number.length - 1; i++) {
            for (int j = 0; j < number.length; j++) {
                int temp = number[j];
                number[j] = temp + 1;


            }

        }
        return number;
    }
}
