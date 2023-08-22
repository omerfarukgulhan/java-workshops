
import java.util.Scanner;

public class BiggestNumber {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter first number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Enter second number:");
        int secondNumber = scanner.nextInt();
        System.out.println("Enter third number:");
        int thirdNumber = scanner.nextInt();

        int max = -1;

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            max = firstNumber;
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            max = secondNumber;
        } else {
            max = thirdNumber;
        }

        System.out.println("Biggest number:" + max);

    }
}
