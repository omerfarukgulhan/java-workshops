
import java.util.Scanner;

public class InterestCalculation {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("How much money would you like to put in:");
        int beginingMoney = scanner.nextInt();
        System.out.println("For how many years:");
        int numberOfYear = scanner.nextInt();
        System.out.println("Ratio of ınterest(example: enter 2 for %2):");
        int interestRatio = scanner.nextInt();
        double totalMoney = beginingMoney;

        for (int i = 0; i < numberOfYear; i++) {
            totalMoney = totalMoney + totalMoney * interestRatio / 100;
        }
        System.out.println(totalMoney);
    }
}
