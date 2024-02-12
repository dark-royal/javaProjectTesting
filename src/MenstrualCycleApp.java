import java.time.Duration;
import java.time.LocalDate;
import java.util.Scanner;


public class MenstrualCycleApp {



        private final static Scanner scanner = new Scanner(System.in);

        public static void main(String[] args) {


            displayIntroduction();

        }

        public static void displayIntroduction() {
            System.out.println("************WELCOME TO PRAISE FLOW***********");
            System.out.println("THANKS FOR CHOOSING PRAISE FLOW  WE WILL LIKE TO TAKE YOU THROUGH OUR THIS PROCESS, I HOPE WE GIVE YOU THE BEST SERVICE");

            display();
        }

        public static void display() {

            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            System.out.println("What would you love to do\n" +
                    "\t\t\tEnter 1 -> check  Next Period Date\n" +
                    "\t\t\tEnter 2 -> check Ovulation Date\n" +
                    "\t\t\tEnter 3 -> check Fertility Period\n" +
                    "\t\t\tEnter 4 -> check Safe Period\n" +
                    "\t\t\tEnter 0 -> Exit Application");
            System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
            option();
        }

        public static void option() {
            System.out.println("Enter your option:");

            String response = scanner.next();

            if (response.equals("1")) {
                checkNextPeriod();
                System.out.print("\n");
            } else if (response.equals("2")) {
                checkOvulationPeriod();
                System.out.print("\n");
            } else if (response.equals("3")) {
                checkFertilityPeriod();
            } else if (response.equals("4")) {
                checkSafePeriod();
            } else if (response.equals("0")) {
                System.out.println("THANKS FOR USING PRAISE FLOW");
                System.exit(404);
            } else {
                System.out.println("invalid input");
                display();
            }
        }






        public static void checkNextPeriod() {
            System.out.println("Next Menstrual Cycle Start Date And End Date");
            System.out.println("Please  enter your Cycle length");
            int cycleLength = scanner.nextInt();
            while (cycleLength > 35){
                System.out.println("irregular flow! Go see your doctor");
                cycleLength = scanner.nextInt();
            }

            System.out.println("Enter date of your last period");
            int day = scanner.nextInt();
            while(day > 31){
                System.out.println("Enter valid date");
            }


            System.out.println("Enter month");
            int month = scanner.nextInt();
            if(month < 0 && month > 12){
                System.out.println("Enter valid month");
            }


            System.out.println("Enter year");
            int year = scanner.nextInt();



            LocalDate date = LocalDate.of(year, month, day);
            LocalDate newDate = date.plusDays(cycleLength);
            System.out.println("your next period is on " + newDate);
            System.out.println("would you love to check other thing? YES/NO");

            String ans = scanner.next();
            if (ans.equalsIgnoreCase("YES")){
                display();
            } else {
                System.out.println("THANKS FOR CHOOSING PRAISE FLOW");
            }

        }

        public static void checkSafePeriod(){
            System.out.print("Enter the average menstrual cycle length in days: ");
            int cycleLength = scanner.nextInt();


            System.out.print("Enter the day of the last menstrual period (lastMenstrualPeriodDay): ");
            int lastMenstrualPeriodDay = scanner.nextInt();

            int safePeriodStart = lastMenstrualPeriodDay + 1;
            int safePeriodEnd = lastMenstrualPeriodDay + cycleLength - 28;

            System.out.println("Safe period is from day " + safePeriodStart + " to day " + safePeriodEnd);



        }

        public static int checkOvulationPeriod() {
            System.out.println("Enter cycle length");
            int cycleLength = scanner.nextInt();
            int ovulationDate = cycleLength - 14;

            System.out.println("Enter last  period");
            int lastPeriod = scanner.nextInt();

            LocalDate localDate = LocalDate.now();
            System.out.println("The day of ovulation is " + localDate.plusDays(ovulationDate));

            System.out.println("would you love to check other thing? YES/NO");

            String ans = scanner.next();
            if (ans.equalsIgnoreCase("YES")){
                display();
            } else {
                System.out.println("THANKS FOR CHOOSING PRAISE FLOW");
            }
            return ovulationDate;




        }





        public  static void checkFertilityPeriod() {
            int fertileWindow = 6;
            System.out.println("Enter cycle length");
            int cycleLength = scanner.nextInt();

            int ovulationDay = checkOvulationPeriod();

            Duration lastPeriod = null;
            Duration fertileStart = lastPeriod.plusDays(ovulationDay - fertileWindow);
            Duration fertileEnd = lastPeriod.plusDays(ovulationDay + fertileWindow);


            //System.out.println("The ovulation day is: " + lastPeriod.plusDays(ovulationDay));
            System.out.println("The fertile window is from: " + fertileStart + " to: " + fertileEnd);
            System.out.println("would you love to check other thing? YES/NO");

            String ans = scanner.next();
            if (ans.equalsIgnoreCase("YES")){
                display();
            } else {
                System.out.println("THANKS FOR CHOOSING PRAISE FLOW");
            }

        }
    }





