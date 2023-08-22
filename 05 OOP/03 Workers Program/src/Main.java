
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String options = "Operations\n"
                + "1. Programmer Operations\n"
                + "2. Manager Operations\n"
                + "Press q for exit";
        System.out.println("**********************************");
        System.out.println(options);
        System.out.println("**********************************");

        while (true) {
            System.out.print("Choose your operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {

                System.out.println("Exiting program...");
                break;

            } else if (operation.equals("1")) {
                Programmer programmer = new Programmer("Omer", "Gulhan", 123, "Python,C,Java");
                String programmerOptions = "1. Change OS\n"
                        + "2. Show information\n"
                        + "Press q for exit";
                System.out.println(programmerOptions);

                while (true) {
                    System.out.print("Choose your operation: ");
                    String programmerOperation = scanner.nextLine();

                    if (programmerOperation.equals("q")) {
                        System.out.println("Exiting programmer operations");
                        break;
                    } else if (programmerOperation.equals("1")) {

                        System.out.print("OS Name: ");
                        String osName = scanner.nextLine();
                        programmer.changeOS(osName);

                    } else if (programmerOperation.equals("2")) {

                        programmer.showInformation();
                    } else {
                        System.out.println("Invalid programmer operation...");
                    }

                }

            } else if (operation.equals("2")) {
                Manager manager = new Manager("Mustafa", "Coskun", 456, 10);

                String managerOptions = "1. Make a raise\n"
                        + "2. Show information\n"
                        + "Press q for exit";
                System.out.println(managerOptions);

                while (true) {
                    System.out.print("Choose your operation: ");
                    String managerOperation = scanner.nextLine();

                    if (managerOperation.equals("q")) {
                        System.out.println("Exiting manager operations");
                        break;

                    } else if (managerOperation.equals("1")) {
                        System.out.print("Amount of raise: ");
                        int amountOfRaise = scanner.nextInt();
                        scanner.nextLine();
                        manager.makeRaise(amountOfRaise);

                    } else if (managerOperation.equals("2")) {
                        manager.showInformation();

                    } else {
                        System.out.println("Invalid manager operation...");
                    }

                }

            } else {
                System.out.println("Invalid operation...");
            }

        }

    }
}
