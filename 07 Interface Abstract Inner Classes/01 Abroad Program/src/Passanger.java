
import java.util.Scanner;

public class Passanger implements AbroadRules {

    private int fee;
    private boolean politicalProhibition;
    private boolean visaStatus;

    public Passanger() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Payment Fee: ");
        this.fee = scanner.nextInt();
        scanner.nextLine();

        System.out.print("Do you have any political bans(yes or no)?");
        String userBanInput = scanner.nextLine();
        if (userBanInput.equals("yes")) {
            this.politicalProhibition = true;
        } else {
            this.politicalProhibition = false;
        }

        System.out.print("Do you have a visa? (yes or no)");
        String userVisaInput = scanner.nextLine();
        if (userVisaInput.equals("yes")) {
            this.visaStatus = true;
        } else {
            this.visaStatus = false;
        }
    }

    @Override
    public boolean abroadFeeControl() {
        if (fee < 150) {
            System.out.println("Please pay the full international exit fee.");
            return false;
        } else {
            System.out.println("International exit fee is done.");
            return true;
        }
    }

    @Override
    public boolean politicalProhibitionControl() {

        if (this.politicalProhibition == true) {
            System.out.println("You have a political ban. You cannot go abroad.");
            return false;
        } else {
            System.out.println("You do not have a political ban.");
            return true;
        }
    }

    @Override
    public boolean visaStatusCheck() {
        if (this.visaStatus == true) {
            System.out.println("Visa complete!");
            return true;
        } else {
            System.out.println("Your visa is not available to your destination country.");
            return false;
        }
    }
}
