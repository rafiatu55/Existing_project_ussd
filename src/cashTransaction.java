import java.util.Scanner;
import java.util.ArrayList;

public class cashTransaction {
    private  ArrayList<String> transfers = new ArrayList<>();
    public void cashTransactions() {
        Ussd ussd = new Ussd();

        Scanner scanner = new Scanner(System.in);
            System.out.println("Cash Transaction Menu:");
            System.out.println("1. Make Payment");
            System.out.println("2. Receive Funds");
            System.out.println("3. View Transfers");
            System.out.println("00. Go Back");

            System.out.println("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    makePayment();
                    break;
                case "2":
                    receiveFunds();
                    break;
                case "3":
                    viewTransfers();
                    break;
                case "00":
                    String[] String = new String[0];
                    Ussd.main(String );
                    break;
            }
        }


    public  void makePayment() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the recipient's name: ");
        String recipientName = scanner.nextLine();

        System.out.println("Enter the payment amount: ");
        double paymentAmount = scanner.nextDouble();
        scanner.nextLine();


        System.out.println("Payment of " + paymentAmount + " to " + recipientName + " successful!");
    }

    public  void receiveFunds() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the sender's name: ");
        String senderName = scanner.nextLine();

        System.out.println("Enter the received amount: ");
        double receivedAmount = scanner.nextDouble();
        scanner.nextLine();

        System.out.println("Received " + receivedAmount + " from " + senderName);
    }

    public  void viewTransfers() {
        System.out.println("Transfer History:");
        for (String transfer : transfers) {
            System.out.println(transfer);
        }
    }
}
