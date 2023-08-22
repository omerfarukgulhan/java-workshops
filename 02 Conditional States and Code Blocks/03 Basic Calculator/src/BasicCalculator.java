
import java.util.Scanner;

public class BasicCalculator {

    public static void main(String[] args) {
        // Switch Case Kullanarak 4 işlem yapan bir hesap makinesi tasarlamaya çalışın.
        Scanner scanner = new Scanner(System.in);

        System.out.println("*****************");
        String options = "1. Add\n"
                + "2. Substract\n"
                + "3. Multiplication\n"
                + "4. Divide";
        System.out.println(options);
        System.out.println("*****************");
        System.out.println("Choose your operations:");
        String operation = scanner.nextLine();

        int firstNumber;
        int secondNumber;

        switch (operation) {
            case "1":
                System.out.print("First Number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Second Number: ");
                secondNumber = scanner.nextInt();
                System.out.println("Result " + (firstNumber + secondNumber));
                break;
            case "2":
                System.out.print("First Number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Second Number: ");
                secondNumber = scanner.nextInt();
                System.out.println("Result " + (firstNumber - secondNumber));
                break;
            case "3":
                System.out.print("First Number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Second Number: ");
                secondNumber = scanner.nextInt();
                System.out.println("Result " + (firstNumber * secondNumber));
                break;
            case "4":
                System.out.print("First Number: ");
                firstNumber = scanner.nextInt();
                System.out.print("Second Number: ");
                secondNumber = scanner.nextInt();
                System.out.println("Result " + ((double) firstNumber / secondNumber));
                break;
            default:
                System.out.println("Invalid Input");

        }
    }
}
