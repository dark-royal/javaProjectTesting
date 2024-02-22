import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Scanner;
public class FireDrillEight {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter your date of birth(dd/mm/yy)");
        String dateOfBirth = scanner.next();

        displayAge(dateOfBirth);
    }





    public static String displayAge(String dateOfBirth) {
        LocalDate localDate = LocalDate.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        int year = Integer.parseInt(String.valueOf(localDate.getYear()));
        int month = Integer.parseInt(String.valueOf(localDate.getMonth()));
        int day = Integer.parseInt(String.valueOf(localDate.getDayOfWeek()));


        //public int getAge(String

        return null;
    }
}
