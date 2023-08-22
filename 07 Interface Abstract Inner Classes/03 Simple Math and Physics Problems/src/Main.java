
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to Math and Physics Problems Program...");

        String options = "Operations...\n"
                + "1. Calculate area of circle.\n"
                + "2. Calculate triangle perimeter \n"
                + "3. Calculate dot product of 2 Vectors\n"
                + "Exit: q";

        while (true) {
            System.out.println(options);
            System.out.print("Select operation: ");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Exiting Program...");
                break;

            } else if (operation.equals("1")) {

                System.out.print("Radius of the circle: ");
                int radius = scanner.nextInt();
                scanner.nextLine();

                Problem.Mathematics.areaOfCircle(radius);

            } else if (operation.equals("2")) {
                System.out.print("Edge 1: ");
                int edge1 = scanner.nextInt();
                System.out.println("Edge 2: ");
                int edge2 = scanner.nextInt();
                System.out.println("Edge 3: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                Problem.Mathematics.trianglePerimeter(edge1, edge2, edge3);

            } else if (operation.equals("3")) {
                Vector vec1 = new Vector("Vector 1");
                Vector vec2 = new Vector("Vector 2");

                Problem.Physics.dotProduct(vec1, vec2);

            } else {
                System.out.println("Invalid operation.");

            }
        }
    }

}
