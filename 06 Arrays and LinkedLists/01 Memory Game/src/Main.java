
import java.util.Scanner;
import java.util.Random;

public class Main {

    public static Card[][] card = new Card[4][4];

    public static void main(String[] args) {

        Random rand = new Random();
        int[] list = {0, 0, 0, 0, 0, 0, 0, 0};
        boolean cond;

        int i, j, temp;

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                cond = true;
                while (cond) {
                    temp = rand.nextInt(8);
                    if (list[temp] < 2) {
                        list[temp]++;
                        card[i][j] = new Card((char) (temp + 65));
                        cond = false;
                    }
                }
            }
        }

        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print(card[i][j].getValue() + " ");
            }
            System.out.println("");
        }

        while (isGameOver() == false) {

            showBoard();
            userGuess();

        }

    }

    public static void userGuess() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("First guess:");
        int i1 = scanner.nextInt();
        int j1 = scanner.nextInt();
        System.out.println("Second guess:");
        int i2 = scanner.nextInt();
        int j2 = scanner.nextInt();
        card[i1][j1].setGuess(true);
        card[i2][j2].setGuess(true);
        showBoard();
        if (card[i1][j1].getValue() == card[i2][j2].getValue()) {
            System.out.println("Congratulation, you guessed right!");

        } else {
            System.out.println("Wrong answer.");
            card[i1][j1].setGuess(false);
            card[i2][j2].setGuess(false);
        }

    }

    public static void showBoard() {

        for (int i = 0; i < 4; i++) {
            System.out.println("____________________");
            for (int j = 0; j < 4; j++) {

                if (card[i][j].isGuess()) {
                    System.out.print(" |" + card[i][j].getValue() + "| ");

                } else {
                    System.out.print(" | | ");

                }
            }
            System.out.println("");
        }
        System.out.println("____________________");

    }

    public static boolean isGameOver() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (card[i][j].isGuess() == false) {
                    return false;

                }

            }
        }
        System.out.println("You won!");
        return true;

    }
}
