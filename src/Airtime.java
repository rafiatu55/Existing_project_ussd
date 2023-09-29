import java.util.Scanner;

public class Airtime {



    public static void amount() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1.Enter the amount to buy:");
        System.out.println("00. Go Back");
        String enterAmount = scanner.nextLine();

        switch (enterAmount) {
            case "1":
                buyAirtimeForSelf();
                break;
            case "00":
                airtimeAndData();
                break;

        }
    }
    public static void recepientNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Enter the recipient number :");
        System.out.println("00. Go Back");

        String recepientNumber = scanner.nextLine();

        switch (recepientNumber) {
            case "1":
                buyAirtimeForSomeoneElse();
                break;
            case "00":
                airtimeAndData();
                break;

        }
    }

    public static void airtimeAndData() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Airtime:");
        System.out.println("2. Data");
        System.out.println("00. Go Back");

        String buy = scanner.nextLine();

        switch (buy) {
            case "1":
                buyingAirtime();
                break;
            case "2":
                Data.buyingData();
                break;
            case "00":
                String[] String = new String[0];
                Ussd.main(String );
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    public static void buyingAirtime() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Buying Airtime Menu:");
        System.out.println("1. Buy airtime for yourself");
        System.out.println("2. Buy airtime for someone ");
        System.out.println("00. Go back");

        System.out.println("Enter your choice: ");
        String choice = scanner.nextLine();

        switch (choice) {
            case "1":
                amount();
                break;
            case "2":
                recepientNumber();
                break;
            case "00":
                airtimeAndData();
                break;
            default:
                System.out.println("Invalid choice. Please try again.");
                break;
        }
    }

    public static void buyAirtimeForSelf() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the amount of airtime you want to purchase:");
        double amount = scanner.nextDouble();

        System.out.println("Are you sure you want to buy?:");
        System.out.println("1. Yes:");
        System.out.println("2. Cancel (quit):");
        System.out.println("00. Go back:");
        int confirm = scanner.nextInt();

        if (confirm == 1) {
            System.out.println("Congrats! You purchased " + amount + " worth of airtime.");
        } else {
            System.out.println("Sad you decided not to purchase anymore!!");
        }
    }

    public static void buyAirtimeForSomeoneElse() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the recipient's phone number:");

        String recipientPhoneNumber = scanner.next();

        double amount = scanner.nextDouble();
        System.out.println("Are you sure you want to buy?:");
        System.out.println("1. Yes:");
        System.out.println("2. Cancel (quit):");
        System.out.println("00. Go back:");
        int confirm = scanner.nextInt();

        if (confirm == 1) {
            System.out.println("Congrats! You purchased " + amount + " of airtime to " + recipientPhoneNumber + " successfully!");
        } else {
            System.out.println("Sad you decided not to purchase anymore!!");
        }
    }
}
