
import java.util.Scanner;

public class BasicATM {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int balance = 1000;
        String options = "Operation 1: Balance Learning\n"
                + "2nd Transaction: Withdrawal\n"
                + "3rd Transaction : Deposit\n"
                + "Press q to exit";

        System.out.println("*************************");
        System.out.println(options);
        System.out.println("*************************");

        while (true) {

            System.out.print("Select Transaction:");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {

                System.out.println("Exiting Program...");
                break;
            } else if (operation.equals("1")) {
                System.out.println("Your balance:" + balance);
            } else if (operation.equals("2")) {
                System.out.print("The amount you want to withdraw:");
                int amount = scanner.nextInt();
                scanner.nextLine();

                if (balance - amount < 0) {

                    System.out.println("Not enough balance. Your balance:" + balance);
                } else {
                    balance -= amount;
                    System.out.println("Your new balance:" + balance);
                }

            } else if (operation.equals("3")) {
                System.out.print("The amount you want to deposit:");
                int amount = scanner.nextInt();
                scanner.nextLine();

                balance += amount;

                System.out.println("Your new balance:" + balance);

            } else {
                System.out.println("Invalid Operation...");
            }
        }
    }
}
