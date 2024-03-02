package personalExercises;

import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Array2 {
    public static void main(String[] args) {
        String[] word = {"praise is a senior dev"};

        System.out.println(Arrays.toString(removeVowels(word)));
    }

    public static String[] removeVowels(String [] word) {
        ArrayList<String> vowels = new ArrayList<>();
        String letter = "";
        for (String s : word) {
            for (int count = 0; count < s.length(); count++){
                String chars = s.charAt(count)+"".toLowerCase();
                if (chars.equals("a") || chars.equals("e") || chars.equals("i") || chars.equals("o") || chars.equals("u")){
                    System.out.println(s.charAt(count) + " is a vowel");
                }else {
                    letter += s.charAt(count);
                }
            }
            vowels.add(letter);
        }
            return populateArray(vowels);
    }

    private static String[] populateArray(ArrayList<String> vowels) {
        String[] word = new String[vowels.size()];
        for (int index = 0; index < word.length; index++){
            word[index] = vowels.get(index);
        }
        return word;
    }

}
