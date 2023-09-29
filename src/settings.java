import java.util.Scanner;

public class settings {

    private static String username = "Tangodi";
    private static String password = "raf123";



    public static void settings() {
        Ussd ussd = new Ussd();
        Scanner scanner = new Scanner(System.in);


            System.out.println("Settings Menu:");
            System.out.println("1. Change Name");
            System.out.println("2. Change Password");
            System.out.println("00. Go Back");

            System.out.print("Enter your choice: ");
            String choice = scanner.nextLine();

            switch (choice) {
                case "1":
                    changeName();
                    break;
                case "2":
                    changePassword();
                    break;
                case "00":
                    String[] String = new String[0];
                    Ussd.main(String );
                    break;

            }
        }


    public static void changeName() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your new name: ");
        String newName = scanner.nextLine();

        username = newName;

        System.out.println("Name changed to: " + newName);
    }

    public static void changePassword() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your current password: ");
        String currentPassword = scanner.nextLine();

        if (!currentPassword.equals(password)) {
            System.out.println("Incorrect current password. Password change failed.");
            return;
        }

        System.out.println("Enter your new password: ");
        String newPassword = scanner.nextLine();


        password = newPassword;

        System.out.println("Password changed successfully.");
    }
}
