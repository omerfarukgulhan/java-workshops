
import java.util.Scanner;

class PoliticalException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("You Have a Political Ban...");
    }
}

class VisaException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("You do not have a visa to go...");
    }
}

class FeeException extends Exception {

    @Override
    public void printStackTrace() {
        System.out.println("Please pay full overseas fee...");
    }
}

public class Passanger {

    private int fee;
    private boolean politicalProhibition;
    private boolean visaStatus;

    public Passanger() {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Overseas fee:");
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

    public void abroadFeeControl() throws FeeException {
        if (this.fee < 150) {
            throw new FeeException();
        } else {
            System.out.println("Overseas fee is done!");
        }
    }

    public void politicalProhibitionControl() throws PoliticalException {
        if (this.politicalProhibition == true) {
            throw new PoliticalException();
        } else {
            System.out.println("You do not have a political ban...");

        }
    }

    public void visaStatusControl() throws VisaException {
        if (this.visaStatus == true) {
            System.out.println("Visa complete!");
        } else {
            throw new VisaException();
        }
    }
}
