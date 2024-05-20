package mrFemiTask;


import java.util.ArrayList;

public class ReverseWord {
    public static void main(String[] args) {
        String word = "i am a good girl i guess";
        System.out.println((reverseWord(word)));
    }

    public static String reverseWord(String word) {
        word += " ";
        ArrayList<String> words = new ArrayList<>();
        String yoo = "";
        for (int i = 0; i < word.length(); i++) {
            char letter = word.charAt(i);
            if(letter == ' '){
                yoo += letter;
                words.add(yoo);
                yoo = "";
                continue;
            }
            yoo += letter;
        }
        String result = "";
        for (int i = words.size() -1; i >=0 ; i--) {
            result += words.get(i);

        }
        return result;
        }





}




