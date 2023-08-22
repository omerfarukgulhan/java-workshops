
public class Main {

    public static void main(String[] args) throws InterruptedException {

        System.out.println("Welcome to the airport...");

        String conditions = "Exit Rules...\n"
                + "You must not have any political bans.\n"
                + "You have to pay your 150 TL tuition fee in full.\n"
                + "You need a visa to the country you are going to.";
        String message = "You have to meet all foreign requirements.";

        while (true) {
            System.out.println("*******************************************");
            System.out.println(conditions);
            System.out.println("*******************************************");

            Passanger passanger = new Passanger();

            System.out.println("Checking Fee...");
            Thread.sleep(2000);
            if (passanger.abroadFeeControl() == false) {

                System.out.println(message);
                continue;
            }

            System.out.println("Checking Political Ban...");
            Thread.sleep(2000);
            if (passanger.politicalProhibitionControl() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Checking Visa Status...");
            Thread.sleep(2000);
            if (passanger.visaStatusCheck() == false) {
                System.out.println(message);
                continue;
            }

            System.out.println("Your transactions are ok! You can go abroad.");
            break;
        }
    }
}
