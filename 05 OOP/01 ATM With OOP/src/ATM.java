
import java.util.Scanner;

public class ATM {

    public void start(Account account) {

        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome.");

        System.out.println("****************************");
        System.out.println("Login:");
        System.out.println("****************************");
        int attempts = 3;

        while (true) {
            if (login.login(account)) {
                System.out.println("Login succesful.");
                break;

            } else {
                System.out.println("Login failed.");
                attempts -= 1;
                System.out.println("Number of attempts left: " + attempts);
            }
            if (attempts == 0) {
                System.out.println("Out of login attempts.");

                return;

            }

        }

        String options = "Operation 1: Balance Learning\n"
                + "2nd Transaction: Deposit\n"
                + "3rd Transaction : Withdraw\n"
                + "Press q to exit";
        System.out.println("*************************");
        System.out.println(options);

        while (true) {
            System.out.println("*************************");
            System.out.println("Select Transaction:");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {

                break;

            } else if (operation.equals("1")) {
                System.out.println("Your balance: " + account.getBalance());
            } else if (operation.equals("2")) {

                System.out.print("The amount you want to deposit: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.deposit(amount);

            } else if (operation.equals("3")) {

                System.out.print("The amount you want to withdraw: ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                account.withdraw(amount);

            } else {

                System.out.println("Invalid Operation...");
            }

        }
    }

}
