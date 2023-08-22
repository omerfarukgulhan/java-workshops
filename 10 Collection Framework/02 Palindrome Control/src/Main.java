
import java.util.Scanner;
import java.util.Stack;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Type for palindrome: ");
        String userSentence = scanner.nextLine();

        Stack<Character> stack = new Stack<Character>();

        for (int i = 0; i < userSentence.length() / 2; i++) {
            stack.push(userSentence.charAt(i));
        }

        if (isPalindrome(userSentence, stack)) {
            System.out.println("It is palindrome.");
        } else {
            System.out.println("It is not palindrome.");
        }
    }

    public static boolean isPalindrome(String userSentence, Stack<Character> stack) {
        for (int i = (userSentence.length() / 2) + 1; i < userSentence.length(); i++) {
            if (userSentence.charAt(i) != stack.pop()) {

                return false;
            }
        }
        return true;
    }
}
