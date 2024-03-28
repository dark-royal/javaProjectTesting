package personalExercises;

public class CaesarCipher2 {
    public static void main(String[] args) {
        String word = "cmbdlipmftbsfxifsfhpeejwjefeczafsp";
        System.out.println("original message: " + word);
        StringBuilder message = new StringBuilder();
        int shift = 1;

        for(char c : word.toCharArray()){
            int i = (int) c;
            i -= shift;

            if(i < (int) 'a'){
                i += 26;
            }
            char character = (char) i;
            message.append(character);
        }

        System.out.println("Decrypted message is" + message);
    }
}
