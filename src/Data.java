import java.util.Scanner;

public class Data {
    static Scanner scanner = new Scanner(System.in);


    public static void amount() {
        System.out.println("Hello Rafia");
        System.out.println("1. Enter the amount to buy:");
        System.out.println("00. Go Back");
        String enterAmount = scanner.nextLine();

        switch (enterAmount) {
            case "1":
                buyDataForSelf();
                break;
            case "00":
                Airtime.airtimeAndData();
                break;


        }
    }




    public static void recepientNumber() {
        System.out.println("1. Enter the recipient number :");
        System.out.println("00. Go Back");

        String recepientNumber = scanner.nextLine();

        switch (recepientNumber) {
            case "1":
                buyDataForSomeoneElse();
                break;
            case "00":
                Airtime.airtimeAndData();
                break;
        }
    }

    public static void buyingData() {
        System.out.println("Buying Data Menu:");
        System.out.println("1. Buy Data for yourself");
        System.out.println("2. Buy Data for someone else");
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
                Airtime.airtimeAndData();
                break;
        }
    }

    public static void buyDataForSelf() {
        System.out.println("Enter the amount of Data you want to purchase:");
        double amount = scanner.nextDouble();

        System.out.println("Are you sure you want to buy?:");
        System.out.println("1. Yes:");
        System.out.println("2. Cancel (quit):");
        System.out.println("00. Go back:");

        double confirm = scanner.nextDouble();
        System.out.println("Congrats! You purchased " + amount + " worth of data ");
    }

    public static void buyDataForSomeoneElse() {
        System.out.println("Enter the recipient's phone number:");
        String recipientPhoneNumber = scanner.next();

        System.out.println("Enter the amount of data you want to send:");
        double amount = scanner.nextDouble();
        System.out.println("Data purchase for " + recipientPhoneNumber + " successful!");
    }
}
