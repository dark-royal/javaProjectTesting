package fireDrillOne;

public class TaskSeven {
    public static void main(String[] args) {
        int number = 1;
        int sum = 0;

        for (int count = 1; count <= 10; count++) {
            for (int counter = 1; counter <= 5; counter++) {
                if (count % 4 == 0) {
                    number *= count;
                    sum += number;


                }
            }


            if (count % 4 == 0) {
                System.out.print(sum + " ");
                number = 1;
                sum = 0;
            }


        }

    }
}


