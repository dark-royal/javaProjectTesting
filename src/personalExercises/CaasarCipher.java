package personalExercises;

public class CaasarCipher {
    public static void main(String[] args) {
        String s = "blackholesarewheregoddividedbyzero";
        System.out.println("original message: " + s);
        StringBuilder message = new StringBuilder();
        int shifts = 1;
        for(char c :s.toCharArray()){
            int i = (int) c;
            i += shifts;
            if(i > (int) 'z'){
                i -= 26;
            }
            char character = (char) i;
            message.append(character);
        }

        System.out.println("Encrypted message: " + message);
    }





}
