
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String operations = "Operations:\n"
                + "1. Calculate area of Square \n"
                + "2. Calculate area of Triangle \n"
                + "3. Calculate area of Circle \n"
                + "Exit: q";

        while (true) {
            System.out.println(operations);
            System.out.print("Which Shape Do You Want To Calculate: ");

            String shapeType = scanner.nextLine();
            Shape shape = null;

            if (shapeType.equals("q")) {
                System.out.println("Exiting Program...");
                break;
            } else if (shapeType.equals("1")) {
                System.out.print("Square Edge: ");
                int edge = scanner.nextInt();
                scanner.nextLine();

                shape = new Square("Square123", edge);

                shape.calculateArea();

            } else if (shapeType.equals("2")) {

                System.out.print("Edge 1: ");
                int edge1 = scanner.nextInt();
                System.out.print("Edge 2: ");
                int edge2 = scanner.nextInt();
                System.out.print("Edge 3: ");
                int edge3 = scanner.nextInt();
                scanner.nextLine();

                shape = new Triangle("Triangle 123", edge1, edge2, edge3);

                shape.calculateArea();

            } else if (shapeType.equals("3")) {
                System.out.print("Radius of the circle: ");
                int radius = scanner.nextInt();
                scanner.nextLine();

                shape = new Circle("Circle 123", radius);

                shape.calculateArea();

            } else {
                System.out.println("Invalid Operation....");
            }

        }
    }

}
