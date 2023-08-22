
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to Sabiha Gökçen Airport....");
        String conditions = "Overseas Departure Rules:\n"
                + "You must not have any political bans...\n"
                + "You have to pay your 150 TL tuition fee in full...\n"
                + "You need a visa to the country you are going to...";
        String message = "You have to meet all foreign departure requirements";

        while (true) {
            System.out.println("******************************************* ");
            System.out.println(conditions);
            System.out.println("******************************************* ");

            Passanger passanger = new Passanger();

            System.out.println("Checking Fee...");
            Thread.sleep(2000);

            try {
                passanger.abroadFeeControl();
            } catch (FeeException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Checking Political Ban...");
            Thread.sleep(2000);

            try {
                passanger.politicalProhibitionControl();
            } catch (PoliticalException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Checking Visa Status...");
            Thread.sleep(2000);

            try {
                passanger.visaStatusControl();
            } catch (VisaException ex) {
                ex.printStackTrace();
                continue;
            }

            System.out.println("Your transactions are ok! You can go abroad...");
            break;
        }
    }
}
