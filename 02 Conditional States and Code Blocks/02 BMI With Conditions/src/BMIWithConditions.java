
import java.util.Scanner;

public class BMIWithConditions {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your weight:");
        int mass = scanner.nextInt();
        System.out.println("Enter your height(m):");
        double height = scanner.nextDouble();

        double bmi = mass / (height * height);
        System.out.println("Your BMI:" + bmi);

        if (bmi < 18.5) {
            System.out.println("Thin");
        } else if (18.5 <= bmi && bmi < 25) {
            System.out.println("Normal");
        } else if (25 <= bmi && bmi < 30) {
            System.out.println("Overweight");
        } else {
            System.out.println("Obese");
        }
    }

}
