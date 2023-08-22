
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Kumanda Programına Hoşgeldiniz...");
        Scanner scanner = new Scanner(System.in);

        String options = "Options:\n"
                + "1. Show Channels\n"
                + "2. Add Channel\n"
                + "3. Delete Channel\n"
                + "4. Learn Number Of Channels\n"
                + "Press q to exit...";

        Controller controller = new Controller();

        while (true) {
            System.out.println("******************************");
            System.out.println(options);
            System.out.print("Choose option.");
            String operation = scanner.nextLine();

            if (operation.equals("q")) {
                System.out.println("Exiting program...");
                break;
            } else if (operation.equals("1")) {
                showChannels(controller);
            } else if (operation.equals("2")) {
                System.out.print("Which channel do you want to add: ");
                String channelName = scanner.nextLine();
                controller.addChannel(channelName);

            } else if (operation.equals("3")) {
                System.out.print("Channel to delete: ");
                String channelName = scanner.nextLine();

                controller.deleteChannel(channelName);

            } else if (operation.equals("4")) {
                System.out.println("Number of channels: " + controller.numberOfChannels());

            } else {
                System.out.println("Invalid operation...");
            }
        }

    }

    public static void showChannels(Controller controller) {

        if (controller.numberOfChannels() == 0) {
            System.out.println("There isn't any channel.");
        } else {
            for (String channel : controller) {
                System.out.println("Channel: " + channel);

            }

        }

    }
}
