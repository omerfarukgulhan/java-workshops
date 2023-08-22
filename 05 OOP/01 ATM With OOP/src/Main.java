
public class Main {

    public static void main(String[] args) {

        ATM atm = new ATM();

        Account account = new Account("Omer", "12345", 1000);

        atm.start(account);
        System.out.println("Exiting Program...");

    }

}
