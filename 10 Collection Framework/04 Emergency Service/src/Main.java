
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {

    public static void main(String[] args) {
        /*
	 Bleeding ----> Highest Priority
         Burn -------> Medium Priority
         Headache ---> Lowest Priority
         */

        Queue<Patient> emergencyService = new PriorityQueue<Patient>();

        emergencyService.offer(new Patient("Murat", "Burn"));
        emergencyService.offer(new Patient("Okan", "Headache"));
        emergencyService.offer(new Patient("Elif", "Bleeding"));
        emergencyService.offer(new Patient("Oğuz", "Burn"));
        emergencyService.offer(new Patient("Merve", "Burn"));
        emergencyService.offer(new Patient("Gizem", "Bleeding"));

        int i = 1;

        while (emergencyService.isEmpty() != true) {
            System.out.println("**************************************");
            System.out.println(i + ". position");
            System.out.println(emergencyService.poll());
            System.out.println("**************************************");
            i++;
        }
    }
}
