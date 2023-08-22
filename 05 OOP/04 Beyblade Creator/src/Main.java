
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Welcome to beyblade creator.");
        System.out.println("Press q for exit.");

        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Which beyblade would you like to create? ");
            String beybladeName = scanner.nextLine();
            if (beybladeName.equals("q")) {

                System.out.println("Exiting program...");
                break;

            } else {
                BeybladeProducer producer = new BeybladeProducer();

                Beyblade beyblade = producer.produceBeyblade(beybladeName);

                if (beyblade == null) {

                    System.out.println("Please enter valid beyblade");
                } else {
                    beyblade.showInformation();
                    beyblade.attack();
                    beyblade.revealSpecialMonster();
                }

            }

        }

    }
}
