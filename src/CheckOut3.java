
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;


    public class CheckOut3 {



        private static final ArrayList<String> product = new ArrayList<>();
        private static final ArrayList<Integer> quantity = new ArrayList<>();
        private static final ArrayList<Double> price = new ArrayList<>();
        private static final ArrayList<Double> total = new ArrayList<>();



        private static String customerName;

        private static Double amountPaid = 0.0;
        private static Double balance = 0.0;
        private static String cashierName;

        private static Double subTotal = 0.0;

        private static final double vat = 0.0;

        public static double discount = 0.0;

        public static double discount2 = 0.0;
        private static Double billTotal = 0.0;



        private static final Scanner input = new Scanner(System.in);


        public static void main(String[] args) {

            LocalDate.now();


            collectInput();

            calculateEachTotal();

            calculateAllTotal();

            discountAmount();

            vat();

            billTotal();

            printReceipt();

            amountPaid();

            balance();

            receipt();
        }


        public static void collectInput() {
            System.out.println("what is the customer'sName");
            customerName = input.next();
            String moreItem;

            do {
                System.out.println("what did the user buy?");


                product.add(input.next());

                System.out.println("how many piece(s)?");
                quantity.add(input.nextInt());

                System.out.println("How much per unit?");

                price.add(input.nextDouble());

                System.out.println("Add more items");
                moreItem = input.next();
            } while (moreItem.equalsIgnoreCase("yes"));



            System.out.println("Cashier name?");
            cashierName = input.next();

            System.out.println("How much discount will he get?");
            discount = input.nextDouble();
        }


        public static void calculateEachTotal() {

            for (int i = 0; i < quantity.size(); i++) {
                total.add(quantity.get(i) * price.get(i));



            }
        }


        public static void calculateAllTotal() {
            for (int i = 0; i < product.size(); i++) {
                subTotal += total.get(i);


            }
        }

        public static double discountAmount() {

            double disc = (discount / 100) * subTotal;

            return subTotal - disc;
        }

        public static void vat() {

            double vat = (17.50 / 100) * subTotal;

        }

        public static void billTotal() {

            billTotal = (subTotal - discountAmount()) + vat;

        }


        public static void printReceipt() {

            System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312, HERBERT MACAULAY WAY, sABO yABA, LAGOS.
                TEL:08364537281
                Date:%s%n
                	""", LocalDate.now());

            System.out.printf("Cashier:%s%n customerName:%s%n", cashierName, customerName);

            System.out.println("====================================================================");

            System.out.printf("		%5s%12s%9s%12s%n%n", "ITEMS", "QUANTITY", "PRICE", " TOTAL");

            System.out.println("---------------------------------------------------------------------");

            for (int i = 0; i < product.size(); i++) {
                System.out.printf("		%s%9d%9.2f%12.2f%n%n", product.get(i), quantity.get(i), price.get(i), total.get(i));
            }
            System.out.println("---------------------------------------------------------------------");


            System.out.printf("""
                		
                		Sub total: %.2f
                		
                		Discount: %.2f

                		VAT @ 17.50: %.2f
                ==================================================================================
                		
                		Bill total: %.2f

                ==================================================================================

                	THIS IS NOT A RECEIPT KINDLY PAY %.2f
                ==================================================================================

                	""", subTotal, discount, vat, billTotal, billTotal);


        }

        public static double amountPaid() {
            System.out.println("How much did the user give to you?");
            amountPaid = input.nextDouble();
            System.out.println(amountPaid);
            return amountPaid;


        }

        public static void balance() {
            balance = amountPaid - billTotal;
            System.out.println(balance);

        }


        public static void receipt() {

            System.out.printf("""
                SEMICOLON STORES
                MAIN BRANCH
                LOCATION:312, HERBERT MACAULAY WAY, sABO yABA, LAGOS.
                TEL:08364537281
                Date:%s%n
                	""", LocalDate.now());

            System.out.printf("Cashier:%s%n customerName:%s%n", cashierName, customerName);

            System.out.println("====================================================================");


            System.out.printf("		%5s%12s%9s%12s%n%n", "ITEMS", "QUANTITY", "PRICE", " TOTAL");

            System.out.println("---------------------------------------------------------------------");


            for (int i = 0; i < product.size(); i++) {

                System.out.printf("		%s%12d%9.2f%12.2f%n%n", product.get(i), quantity.get(i), price.get(i), total.get(i));
            }

            System.out.println("---------------------------------------------------------------------");

            System.out.printf("""
                		
                		Sub total: %.2f
                		
                		Amount paid:%.2f

                		Balance:%.2f
                ===============================================================
                		
                		THANK YOU FOR YOUR PATRONAGE

                ==================================================================================

                """, subTotal, amountPaid, amountPaid - subTotal);


        }
    }




