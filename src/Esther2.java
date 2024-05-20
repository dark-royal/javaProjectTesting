import java.util.Scanner;

public class Esther2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String addItems ;


        do{
            System.out.println("Enter item bought");
            String item = scanner.next();

            System.out.println("Enter price");
            int price = scanner.nextInt();

            System.out.println("add new item");
            addItems = scanner.next();

        }while (addItems.equalsIgnoreCase("yes"));
    }
}
