import java.util.Scanner;
public class Praise1 {

        public static void main(String[] args) {

            Scanner input = new Scanner(System.in);

            String prompt = """
                    Menu
                    Press any number
                    """;

            System.out.println(prompt);
            int userInput = input.nextInt();


            String prompt1 = """
                    Menu
                    Select Number:


                    1. Phone book
                    2. Message
                    3. Chat
                    4. Call register
                    5. Tones
                    6. Settings
                    7. Call divert
                    8. Games
                    9. Calculator
                    10. Reminders
                    11. Clock
                    12. Profiles
                    13. Sim services
                    14. Back
                    	    """;

            System.out.println(prompt1);
            Scanner input1 = new Scanner(System.in);
            int userInput1 = input.nextInt();

            String prompt2 = """
                    1. Search
                    2. Service Nos.
                    3. Add name 
                    4. Erase
                    5. Assign tone
                    6. Options
                    7. Speed dials
                    8. Voice tags
                    """;

            switch (userInput1) {

                case 1 -> {
                    System.out.println("Phone book \n" + prompt2);
                    int userInput2 = input.nextInt();
                    switch (userInput2) {
                        case 1 -> System.out.println("Search");
                        case 2 -> System.out.println(" Service Nos.");
                        case 3 -> System.out.println("Add name");
                        case 4 -> System.out.println("Erase");
                        case 5 -> System.out.println("Assign tone");
                        case 6 -> System.out.println("Options");
                        case 7 -> System.out.println("Speed dials");
                        case 8 -> System.out.println("Voice tags");
                        default -> System.out.print("Wrong input");
                    }
                }

                case 2 -> System.out.println("Message");
                case 3 -> System.out.println("Chat");
                case 4 -> System.out.println("Call register");
                case 5 -> System.out.println("Tones");
                case 6 -> System.out.println("Settings");
                case 7 -> System.out.println("Call divert");
                case 8 -> System.out.println("Games");
                case 9 -> System.out.println("Calculator");
                case 10 -> System.out.println("Reminders");
                case 11 -> System.out.println("Clock");
                case 12 -> System.out.println("Profiles");
                case 13 -> System.out.println("Sim services");
                case 14 -> System.out.println("Back");
                default -> System.out.println("Error");
            }
        }
}
