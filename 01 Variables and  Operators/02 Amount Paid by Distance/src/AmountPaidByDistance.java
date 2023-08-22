
import java.util.Scanner;

public class AmountPaidByDistance {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much does your car cost per kilometer?");
        double costPerKilometer = scanner.nextDouble();
        System.out.println("How many kilmeters did you travel?");
        double distance = scanner.nextDouble();

        double totalCost = costPerKilometer * distance;
        System.out.println("Total:" + totalCost);

    }
}
