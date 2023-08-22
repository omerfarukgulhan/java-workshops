
import java.util.Scanner;

public class BodyMassIndexCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight:");
        int mass = scanner.nextInt();
        System.out.println("Enter your height(m):");
        double height = scanner.nextDouble();

        double bmi = mass / (height * height);
        System.out.println("Your BMI:" + bmi);
    }

}
