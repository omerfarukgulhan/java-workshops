
import java.util.Scanner;

public class ArmstrongNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number:");
        int userInput = scanner.nextInt();
        int numberOfDigits = (int) (Math.log10(userInput) + 1);

        int temp = userInput;
        int total = 0;
        while (temp != 0) {
            int digitValue = temp % 10;
            temp = temp / 10;
            total = total + (int) Math.pow(digitValue, numberOfDigits);
        }

        if (total == userInput) {
            System.out.println("The number is armstrong number.");
        } else {
            System.out.println("The number is not armstrong number.");
        }

    }
}
