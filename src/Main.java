////TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
//// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
//public class Main {
//    public static void main(String[] args) {
//        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
//        // to see how IntelliJ IDEA suggests fixing it.
//        System.out.printf("Hello and welcome!");
//
//        for (int i = 1; i <= 5; i++) {
//            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
//            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
//            System.out.println("i = " + i);
//        }
//    }
//}

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
//        int [] myList = {2,9,6,8,5,9,2};
//
//        int max = myList[0];
//        int indexOfMax = 0;
//        for(int i = 0; i < myList.length; i++){
//            if(myList[i] > max){
//                max = myList[i];
//                indexOfMax = i;
//            }
//
//        }
//        System.out.println(max);
//        System.out.println(indexOfMax);

//        for(int index = myList.length - 1; index > 0; index--){

//            int temp = myList[index];
//            myList[index] = myList[j];
//            myList[j] = temp;
//
//            System.out.println(myList[j]);
//
//
//        }
//
//        int temp = myList[0];
//        for (int i = 1; i < myList.length; i++){
//            myList[i - 1] = myList[i];
//        }
//        myList[myList.length -1] = temp;
//        System.out.println(myList[myList.length -1]);
//        Scanner input = new Scanner(System.in);
//        String[] months = {"January", "February", "December"};
//        System.out.print("Enter a month number (1 to 12): ");
//        int monthNumber = input.nextInt();
//        System.out.println("The month is " + months[monthNumber - 1]);

        int[] source = {3, 4, 5};

        int[] t = new int[source.length];
        for(int index = 0; index < source.length; index++){
            t[index] = source[index];
            System.out.println(t[index]);
        }
    }
}