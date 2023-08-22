
import java.util.Scanner;

public class Main {

    public static Singers singers = new Singers();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Welcom to singer app.");

        showOptions();

        boolean exit = false;

        int operaiton;

        while (!exit) {
            System.out.println("Choose operaiton:");

            operaiton = scanner.nextInt();

            scanner.nextLine();

            switch (operaiton) {
                case 0:
                    showOptions();
                    break;
                case 1:
                    showSingers();
                    break;
                case 2:
                    addSinger();
                    break;
                case 3:
                    updateSinger();
                    break;
                case 4:
                    deleteSinger();
                    break;
                case 5:
                    searchSinger();
                    break;
                case 6:
                    exit = true;
                    System.out.println("Exiting program.");
                    break;
            }
        }
    }

    public static void showOptions() {
        System.out.println("\t 0-Show Options");
        System.out.println("\t 1-Show Singers");
        System.out.println("\t 2-Add Singer");
        System.out.println("\t 3-Update Singer");
        System.out.println("\t 4-Delete Singer");
        System.out.println("\t 5-Search Singer");
        System.out.println("\t 6-Exit Program");
    }

    public static void showSingers() {
        singers.showSingers();
    }

    public static void addSinger() {
        System.out.println("What is the name of new singer:");
        String newSinger = scanner.nextLine();

        singers.addSinger(newSinger);
    }

    public static void updateSinger() {
        System.out.println("Which singer do you want to change(1,2,3):");
        int position = scanner.nextInt();
        scanner.nextLine();
        String newSinger = scanner.nextLine();

        singers.updateSinger(position - 1, newSinger);
    }

    public static void deleteSinger() {
        System.out.println("Which singer do you want to delete(1,2,3):");
        int position = scanner.nextInt();

        singers.deleteSinger(position - 1);
    }

    public static void searchSinger() {
        System.out.println("Singers name for search:");
        String singerName = scanner.nextLine();

        singers.searchSinger(singerName);
    }

}
