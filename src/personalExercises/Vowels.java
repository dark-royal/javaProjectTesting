package personalExercises;
public class Vowels {
    public static void main(String[] args) {
        String[] word = {"semicolon really chnages"};
        String vowel = "a,e,i,o,u";
        String remainingLetter = "";

        for(String s : word){
            for (int i = 0; i < s.length(); i++) {
                String chars = String.valueOf(s.charAt(i));
                if(chars.equals("a") || chars.equals("e") || chars.equals("i") || chars.equals("o") || chars.equals("u")){
                }
                else{
                    remainingLetter += s.charAt(i);



                }

            }
            System.out.println(remainingLetter);



        }
        }


    }

