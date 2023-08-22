
import java.util.Scanner;

public class Main {

    public static int substract(int a, int b) {

        return (a - b);

    }   

    public static double divide(int a, int b) {
        return ((double) a / b);

    }

    public static int add(int a, int b) {

        return (a + b);

    }

    public static int add(int a, int b, int c) {

        return (a + b + c);
    }

    public static int multiply(int a, int b) {

        return a * b;
    }

    public static int multiply(int a, int b, int c) {
        return a * b * c;

    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String options = "1. Add\n"
                + "2. Subtraction\n"
                + "3. Multiplication\n"
                + "4. Division \n"
                + "Press q to exit.";

        System.out.println("*************************");
        System.out.println(options);
        System.out.println("*************************");

        while (true) {
            System.out.print("Select Operation:");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {

                System.out.println("Exiting Program...");
                break;
            } else if (operation.equals("1")) {
                System.out.print("How many numbers will you calculate? (2 or 3): ");

                int numbers = scanner.nextInt();

                if (numbers == 2) {
                    System.out.print("First number:");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Second number:");
                    int secondNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Result: " + (Main.add(firstNumber, secondNumber)));

                } else if (numbers == 3) {
                    System.out.print("First number:");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Second number:");
                    int secondNumber = scanner.nextInt();
                    System.out.print("Third number:");
                    int thirdNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Result: " + (add(firstNumber, secondNumber, thirdNumber)));

                } else {

                    System.out.println("There is no method for that.");
                }

            } else if (operation.equals("2")) {
                System.out.print("First number:");
                int firstNumber = scanner.nextInt();
                System.out.print("Second number:");
                int secondNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Result: " + substract(firstNumber, secondNumber));

            } else if (operation.equals("3")) {
                System.out.print("How many numbers will you calculate? (2 or 3): ");

                int numbers = scanner.nextInt();

                if (numbers == 2) {
                    System.out.print("First number:");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Second number:");
                    int secondNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Result: " + (Main.multiply(firstNumber, secondNumber)));

                } else if (numbers == 3) {
                    System.out.print("First number:");
                    int firstNumber = scanner.nextInt();
                    System.out.print("Second number:");
                    int secondNumber = scanner.nextInt();
                    System.out.print("Third number:");
                    int thirdNumber = scanner.nextInt();
                    scanner.nextLine();

                    System.out.println("Result: " + (multiply(firstNumber, secondNumber, thirdNumber)));

                } else {

                    System.out.println("There is no method for that.");
                }

            } else if (operation.equals("4")) {
                System.out.print("First number:");
                int firstNumber = scanner.nextInt();
                System.out.print("Second number:");
                int secondNumber = scanner.nextInt();
                scanner.nextLine();

                System.out.println("Result: " + divide(firstNumber, secondNumber));

            } else {
                System.out.println("Invalid operation.");
            }

        }

    }
}
