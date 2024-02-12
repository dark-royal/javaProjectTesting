package javaExamplesWithExamples;

public class Question1{
    public static void main(String[] args) {
        int[] numArray = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15};

        System.out.println(numArray[10]);

        numArray[5] = 35;


        numArray[9] = numArray[6] + numArray[13];

        System.out.println(numArray[9]);
        System.out.println(numArray[5]);
    }

}
