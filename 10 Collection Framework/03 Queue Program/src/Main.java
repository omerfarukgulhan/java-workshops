
import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws InterruptedException {

        Random random = new Random();
        System.out.print("Welcome to queue app.");
        Queue<String> queue = new LinkedList<String>();

        queue.offer("Murat");
        queue.offer("Hasan");
        queue.offer("Okan");
        queue.offer("Ayşe");
        queue.offer("Merve");
        queue.offer("Ezgi");
        queue.offer("Gizem");
        queue.offer("Mehmet");
        queue.offer("Oğuz");
        queue.offer("Azer");

        int numberOfItems = 1 + random.nextInt(10);
        System.out.println("Number of items:" + numberOfItems);
        Thread.sleep(2000);

        while (numberOfItems != 0) {
            System.out.println(queue.poll() + " took an item.");
            numberOfItems--;
            Thread.sleep(1000);
        }

        System.out.println("No items left.");
    }
}
