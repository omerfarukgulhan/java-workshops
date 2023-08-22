
import java.util.Scanner;

public class GradeCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("First Exam (%30): ");
        int firstExam = scanner.nextInt();
        System.out.print("Second Exam (%30): ");
        int secondExam = scanner.nextInt();
        System.out.print("Final (%40): ");
        int finalGrade = scanner.nextInt();

        double avarageGrade = (firstExam * 3 / 10.0) + (secondExam * 3 / 10.0) + (finalGrade * 4 / 10.0);

        System.out.println("Your grade:" + avarageGrade);

        if (avarageGrade >= 90) {
            System.out.println("AA");
        } else if (avarageGrade >= 85) {
            System.out.println("BA");
        } else if (avarageGrade >= 80) {
            System.out.println("BB");
        } else if (avarageGrade >= 75) {
            System.out.println("CB");
        } else if (avarageGrade >= 70) {
            System.out.println("CC");
        } else if (avarageGrade >= 65) {
            System.out.println("DC");
        } else if (avarageGrade >= 60) {
            System.out.println("DD");
        } else if (avarageGrade >= 55) {
            System.out.println("FD");
        } else {
            System.out.println("FF");
        }
    }
}
