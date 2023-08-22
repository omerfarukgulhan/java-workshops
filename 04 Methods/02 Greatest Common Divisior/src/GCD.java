
import java.util.Scanner;

public class GCD {

    public static int gcdFinder(int firstNumber, int secondNumber) {

        int gcd = 1;

        for (int i = 1; i <= firstNumber && i <= secondNumber; i++) {
            if ((firstNumber % i == 0) && (secondNumber % i == 0)) {

                gcd = i;
            }
        }

        return gcd;

    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("First Number:");
        int firstNumber = scanner.nextInt();
        System.out.println("Second Number:");
        int secondNumber = scanner.nextInt();
        
        System.out.println("GCD of the inputs: " + gcdFinder(firstNumber, secondNumber));

    }

}
