
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

class MultiplyingException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Both numbers are too big. Please enter smaller numbers...");
    }
}

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("************************************");
        String options = "1. Add\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division";
        System.out.println(options);
        System.out.println("***********************************");
        System.out.println("Select Process:");
        String operation = scanner.nextLine();
        int firstNumber;
        int secondNumber;

        try {
            switch (operation) {
                case "1":
                    System.out.print("First number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Second number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("Result of enterered numbers: " + (firstNumber + secondNumber));
                    break;
                case "2":
                    System.out.print("First number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Second number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("Result of enterered numbers: " + (firstNumber - secondNumber));
                    break;
                case "3":
                    System.out.print("First number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Second number: ");
                    secondNumber = scanner.nextInt();
                    if (firstNumber > 10000 && secondNumber > 10000) {
                        throw new MultiplyingException();

                    }
                    System.out.println("Result of enterered numbers: " + (firstNumber * secondNumber));
                    break;
                case "4":
                    System.out.print("First number: ");
                    firstNumber = scanner.nextInt();
                    System.out.print("Second number: ");
                    secondNumber = scanner.nextInt();
                    System.out.println("Result of enterered numbers: " + (firstNumber / secondNumber));
                    break;
                default:
                    System.out.println("Invalid operation...");
            }
        } catch (ArithmeticException e) {
            System.out.println("A number cannot be divided by 0...");
        } catch (InputMismatchException e) {
            System.out.println("Please Enter Inputs In Correct Format...");
        } catch (MultiplyingException ex) {
            ex.printStackTrace();
        }
    }
}
