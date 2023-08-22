
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence:");
        String userSentence = scanner.nextLine();

        Map<Character, Integer> frequency = new TreeMap<Character, Integer>();

        for (int i = 0; i < userSentence.length(); i++) {
            char currentChar = userSentence.charAt(i);

            if (frequency.containsKey(currentChar)) {
                frequency.replace(currentChar, frequency.get(currentChar) + 1);
            } else {
                frequency.put(currentChar, 1);
            }
        }

        for (Map.Entry<Character, Integer> entry : frequency.entrySet()) {
            System.out.println("'" + entry.getKey() + "': " + entry.getValue());
        }
    }
}
