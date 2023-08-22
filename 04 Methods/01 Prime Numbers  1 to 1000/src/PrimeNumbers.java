
public class PrimeNumbers {

    public static boolean isItPrime(int number) {
        if (number <= 1) {
            return false;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;

    }

    public static void main(String[] args) {

        for (int i = 0; i < 1000; i++) {
            if (isItPrime(i)) {
                System.out.println(i + " is prime number.");
            }
        }

    }
}
