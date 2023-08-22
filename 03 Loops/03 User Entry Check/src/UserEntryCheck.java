
import java.util.Scanner;

public class UserEntryCheck {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        int numberOfAttempts = 3;

        String sys_user_name = "Omer Faruk Gulhan";
        String sys_password = "12345";

        while (true) {
            System.out.print("User Name:");
            String userNameInput = scanner.nextLine();
            System.out.print("Password:");
            String userPasswordInput = scanner.nextLine();

            if (userNameInput.equals(sys_user_name) && userPasswordInput.equals(sys_password)) {
                System.out.println("Welcome, " + userNameInput);
                break;
            } else if (userNameInput.equals(sys_user_name) && !userPasswordInput.equals(sys_password)) {

                System.out.println("Wrong Password.");
                numberOfAttempts -= 1;

                System.out.println("Attempt Left:" + numberOfAttempts);

            } else if (!userNameInput.equals(sys_user_name) && userPasswordInput.equals(sys_password)) {

                System.out.println("Wrong User Name.");
                numberOfAttempts -= 1;
                System.out.println("Attempt Left:" + numberOfAttempts);

            } else {
                System.out.println("Wrong User Name and Password.");

                numberOfAttempts -= 1;
                System.out.println("Attempt Left:" + numberOfAttempts);

            }
            if (numberOfAttempts == 0) {

                System.out.println("Too many wrong attempts.");
                break;
            }

        }

    }

}
