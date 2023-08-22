
import java.util.Scanner;

public class HypotenuseCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Length of the 1st edge:");
        int firstEdge = scanner.nextInt();
        System.out.println("Length of the 1st edge:");
        int secondEdge = scanner.nextInt();

        double hypotenuse = Math.sqrt(firstEdge * firstEdge + secondEdge * secondEdge);
        System.out.println("Length of hypotenuse:" + hypotenuse);
    }

}
