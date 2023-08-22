
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to workout program");

        String workouts = "Workout Moves: 20Burpee, Pushup, Situp, Squat";
        System.out.println(workouts);

        System.out.println("Choose your workout plan;");

        System.out.print("Number of Burpee: ");
        int burpee = scanner.nextInt();
        System.out.print("Number of Pushup: ");
        int pushup = scanner.nextInt();
        System.out.print("Number of Situp: ");
        int situp = scanner.nextInt();
        System.out.print("Number of Squat: ");
        int squat = scanner.nextInt();

        scanner.nextLine();

        Workout workout = new Workout(burpee, pushup, situp, squat);

        System.out.println("Workout Begins...");

        int i = 1;

        try (FileWriter writer = new FileWriter("log.txt")) {
            writer.write("Workout Program...\n");
            writer.write("Burpee Number: " + workout.getNumberOfBurpee() + " \n");
            writer.write("Pushup Number: " + workout.getNumberOfPushup() + " \n");
            writer.write("Situp Number: " + workout.getNumberOfSitup() + " \n");
            writer.write("Squat Number: " + workout.getNumberOfSquat() + " \n");

            while (workout.isWourkoutOver() == false) {

                System.out.print("Workout Type(Burpee,Pushup,Situp,Squat) : ");
                String workoutType = scanner.nextLine();
                System.out.print("How many moves are you going to do: ");
                int numberOfMove = scanner.nextInt();
                scanner.nextLine();
                workout.startWorkout(workoutType, numberOfMove);

                writer.write(i + ".İşlem ---------->  Hareket : " + workoutType + " Sayı : " + numberOfMove + "\n");
                i++;
            }
            System.out.println("***************************");
            System.out.println("You completed your workout.");
            System.out.println("***************************");

        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
