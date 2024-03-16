package personalExercises;

public class MorseCode1 {
    public static void main(String[] args) {
        String s = ".. -.-. - ... --- -.-. .. .- .-..";
        System.out.println("The original message: " + s);
// the string with a decoded message
        StringBuilder message = new StringBuilder();

// array definitions
        String alphabetChars = "abcdefghijklmnopqrstuvwxyz";
        String[] morseChars = {".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....",
                "..", ".---", "-.-", ".-..", "--", "-.", "---", ".--.", "--.-", ".-.", "...", "-", "..-",
                "...-", ".--", "-..-", "-.--", "--.."};
        // splitting the string into Morse characters
        String[] characters = s.split(" ");

// iterating over Morse characters
        for (String morseChar : characters) {
            char alphabetChar = '?';
            int index = -1;
            for (int i = 0; i < morseChars.length; i++) {
                if (morseChars[i].equals(morseChar)) {
                    index = i;
                }
            }
            if (index >= 0) { // character was found
                alphabetChar = alphabetChars.charAt(index);
            }
            message.append(alphabetChar);

        }
        System.out.println("The decoded message: " + message);

    }
}
