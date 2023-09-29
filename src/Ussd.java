import java.util.Scanner;

public class Ussd {


    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dail *455# : ");
        String shortcode = scanner.nextLine();

        cashTransaction cash = new cashTransaction();
        settings settings = new settings();

        if (scanner.equals("*455#")) {
            System.out.println("Main Menu:");
            System.out.println("1. Buy Airtime/Data");
//                System.out.println("2. Buy Data");
            System.out.println("2. Cash Transactions");
            System.out.println("3. Settings");

            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    Airtime.airtimeAndData();
                    break;

                case "2":
                    cash.cashTransactions();
                    break;
                case "3":
                    settings.settings();
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }
        }else {
            System.out.println("Invalid input");
        }


    }
}