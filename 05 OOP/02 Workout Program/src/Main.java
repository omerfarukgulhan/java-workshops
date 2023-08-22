
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // Idman Oluşturma Programı
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to workout program");

        String workouts = "Workout Moves:Burpee, Pushup, Situp, Squat";
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

        while (workout.isWourkoutOver() == false) {

            System.out.print("Workout Type(Burpee,Pushup,Situp,Squat) : ");
            String workoutType = scanner.nextLine();
            System.out.print("How many moves are you going to do: ");
            int numberOfMove = scanner.nextInt();
            scanner.nextLine();
            workout.startWorkout(workoutType, numberOfMove);

        }
        System.out.println("***************************");
        System.out.println("You completed your workout.");
        System.out.println("***************************");
    }
}
