import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayList;
import java.util.Scanner;
public class FireDrillThree {


    Scanner scanner = new Scanner(System.in);

    public int[] taskOne(int[] score) {
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter scores");
            score[i] = scanner.nextInt();
        }
        return score;
    }

    public int[] taskTwo() {
        int[] score = new int[10];
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter score");
            score[index] = scanner.nextInt();
        }
        return score;
    }

    public int[] taskThree(int[] scores) {
        for (int index = 0; index < 10; index++) {
            System.out.println("Enter score");
            scores[index] = scanner.nextInt();
            System.out.print(scores + " ");

        }
        return scores;
    }

    public static ArrayList<Integer> taskFour(int[] array) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < array.length; index++) {
            if (array[index] % 2 == 0) {
                numbers.add(array[index]);
            }
        }

        return numbers;


    }


    public static ArrayList<Integer> taskFive(int[] array1) {
        ArrayList<Integer> numbers = new ArrayList<>();
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] % 2 != 0) {
                numbers.add(array1[index]);
                System.out.print(array1[index] + " ");
            }
        }
        return numbers;
    }

    public static int taskSix(int[] array1) {
        int sum = 0;
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] % 2 != 0) {
                sum += array1[index];
            }

        }
        System.out.println(sum);
        return sum;
    }

    public static int taskSeven(int[] array1) {
        int sum = 0;
        for (int i : array1) {
            if (i % 2 == 0) {
                System.out.println(i);
                sum += i;
            }
        }
        System.out.println(sum);
        return sum;

    }

    public static int taskEight(int[] array1) {
        int minimum = array1[0];
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] % 2 == 0) {
                if (array1[index] < minimum) {
                    minimum = array1[index];
                }

            }

        }
        return minimum;
    }

    public static int taskNine(int[] array1) {
        int maximum = array1[0];
        for (int index = 0; index < array1.length; index++) {
            if (array1[index] % 2 == 0) {

                if (array1[index] > maximum) {
                    maximum = array1[index];
                }
            }
        }

        return maximum;
    }

    public static int taskTen(int[] array1){
        int minimum = Integer.MAX_VALUE;
        for (int i : array1) {
            if (i % 2 != 0) {
                if (i < minimum) {
                    minimum = i;
                }

            }
        }
        return minimum;

        }



    public static int taskEleven(int[] array1){
        int maximum = array1[0];
        for(int index = 0;index < array1.length; index++) {
            if (array1[index] % 2 != 0) {
                System.out.println(array1[index]);
                if (array1[index] > maximum) {
                    maximum = array1[index];
            }

            }
        }
        return  maximum;
    }

    }
