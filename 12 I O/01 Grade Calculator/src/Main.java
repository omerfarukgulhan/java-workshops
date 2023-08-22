
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static String calculateGrade(String name, int firstExam, int secondExam, int finalExam) {

        String letterGrade = "";

        double finalGrade = (firstExam * 3 / 10.0) + (secondExam * 3 / 10.0) + (finalExam * 4 / 10.0);

        if (finalGrade >= 90) {
            letterGrade = name + " AA";
        } else if (finalGrade >= 85) {
            letterGrade = name + " BA";

        } else if (finalGrade >= 80) {
            letterGrade = name + " BB";

        } else if (finalGrade >= 75) {
            letterGrade = name + " CB";

        } else if (finalGrade >= 70) {
            letterGrade = name + " CC";

        } else if (finalGrade >= 65) {
            letterGrade = name + " DC";

        } else if (finalGrade >= 60) {
            letterGrade = name + " DD";

        } else if (finalGrade >= 55) {
            letterGrade = name + " FD";

        } else {
            letterGrade = name + " FF";
        }
        return letterGrade;
    }

    public static void main(String[] args) {

        try (Scanner scanner = new Scanner(new FileReader("student-grades.txt")); FileWriter writer = new FileWriter("student-letter-grades.txt")) {

            while (scanner.hasNextLine()) {
                String studentInformation = scanner.nextLine();

                String[] studentArray = studentInformation.split(",");
                int firstExam = Integer.valueOf(studentArray[1]);
                int secondExam = Integer.valueOf(studentArray[2]);
                int finalExam = Integer.valueOf(studentArray[3]);

                String output = calculateGrade(studentArray[0], firstExam, secondExam, finalExam);
                writer.write(output + "\n");
            }

        } catch (FileNotFoundException ex) {
            System.out.println("File exception.");
        } catch (IOException ex) {
            System.out.println("IOException.");
        }
    }
}
