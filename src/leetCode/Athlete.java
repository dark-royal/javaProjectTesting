package leetCode;

import java.util.Arrays;

public class Athlete {
    public static void main(String[] args) {
        int[] scores = {8, 5, 1, 15, 21, 2};
        System.out.println(Arrays.toString(giveAward(scores)));
    }

    public static int[] getAthletePositionAndAward(int[] scores) {
        int temp = 0;
        for (int i = 0; i < scores.length; i++) {
            for (int j = 0; j < scores.length; j++) {
                if (scores[i] > scores[j]) {
                    temp = scores[i];
                    scores[i] = scores[j];
                    scores[j] = temp;
                    //System.out.println(Arrays.toString(scores));
                }
            }
        }

        return scores;
    }

    public static int[] number(int[] scores) {
        int[] number = new int[scores.length];
        for (int i = 0; i < scores.length; i++) {
            number[i] = scores[i];
        }
        return number;
    }

    public static int[] giveAward(int[] scores) {
        int[] number = number(scores);
        int[] result = new int[scores.length];
        int[] sortedNumber = getAthletePositionAndAward(scores);
        for (int outer = 0; outer < number.length; outer++) {
            for (int innerLoop = 0; innerLoop < number.length; innerLoop++) {
                if (number[outer] == sortedNumber[innerLoop]) {
                    result[outer] = innerLoop + 1;
                }
            }
        }
        giveAward(scores);
        return result;
    }


    public String[] award(int[] scores){
        String [] awards = new String[scores.length];

        for (int i = 0; i < awards.length; i++) {
            if(scores[i] == 1){
                return new String[]{"gold medal"};
            }
            else if(scores[i] == 2){
                return new String[]{"silver medal"};

            } else if (scores[i] == 3) {
                return new String[]{"bronze medals"};

            }
        }
        return awards;
    }
}