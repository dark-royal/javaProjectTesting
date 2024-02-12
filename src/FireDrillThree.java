import java.util.Scanner;
public class FireDrillThree {

    public static void main(String[] args) {
        FireDrillThree fireDrillThree = new FireDrillThree();

        //fireDrillThree.taskOne();
//        fireDrillThree.taskTwo();
//        fireDrillThree.taskThree();
//        fireDrillThree.taskFour();
        fireDrillThree.taskFive();;
        fireDrillThree.taskSix();
//        fireDrillThree.taskSeven();
//        fireDrillThree.taskEight();
//        fireDrillThree.taskNine();
//        fireDrillThree.taskTen()
    }


    Scanner scanner = new Scanner(System.in);

    public int[] taskOne() {
        int [] score = new int[10];
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter scores");
            score[i] = scanner.nextInt();
        }
        return score;
    }

    public int[] taskTwo() {
        int [] score = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter score");
            score[index] = scanner.nextInt();
        }
        return score;
    }

    public int[] taskThree() {
        int[] scores = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter score");
            scores[index] = scanner.nextInt();
            System.out.print(scores + " ");
        }
        return scores;
    }

    public void taskFour() {
        int[] array = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
        for (int index = 0; index <= array.length; index++) {
            if (array[index] % 2 == 0) {
                System.out.println(array[index]);
            }
        }



    }


        public void taskFive(){
            int[] array1 = {2, 3, 7, 9, 13, 7, 9, 8, 6, 17, 8, 5};
            for (int index = 0; index < array1.length; index++) {
                if (array1[index] % 2 != 0) {
                    System.out.print(array1[index] + " ");
                }
            }

        }
        public void taskSix () {
            int sum = 0;
            int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
            for (int index = 0; index <= array1.length; index++) {
                if (array1[index] % 2 != 0) {
                    System.out.println(array1[index]);
                }

                    sum += array1[index];


            }
            System.out.println(sum);
        }

        public void taskSeven () {
            int sum = 0;
            int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
            for (int index = 0; index <= array1.length; index++) {
                if (array1[index] % 2 != 0) {
                    System.out.println(array1[index]);
                    sum += array1[index];
                }
            }
            System.out.println(sum);

        }

        public int taskEight() {

            int[] array1 = {2, 3, 7, 9, 13, 12, 9, 8, 6, 17, 8, 5};
            int minimum = array1[0];
            for (int index = 0; index <= array1.length; index++) {
                if (array1[index] % 2 == 0) {
                    System.out.println(array1[index]);
                }
                if (minimum < array1[index]) {
                  minimum = array1[index ];
                }


            }
            return minimum;
        }

        public int taskNine (int [] array1 ) {
            int maximum = array1[0];
            for (int index = 0; index <= array1.length; index++) {
                if (array1[index] % 2 == 0) {
                    System.out.println(array1[index]);

                    if (array1[index] > maximum) {
                        maximum = array1[index];
                    }
                }
            }

            return maximum;
        }

        public int taskTen(int[] array1){
            int minimum = array1[0];
            for(int index = 0;index <= array1.length; index++) {
                if (array1[index] % 2 != 0) {
                    System.out.println(array1[index]);
                }
                if (array1[index] < minimum) {
                    minimum = array1[index];
                }
            }
            return  minimum;
        }

    public int taskEleven(int[] array1){
        int maximum = array1[0];
        for(int index = 0;index <= array1.length; index++) {
            if (array1[index] % 2 != 0) {
                System.out.println(array1[index]);
            }
            if (array1[index] > maximum) {
                maximum = array1[index];
            }
        }
        return  maximum;
    }

    }
