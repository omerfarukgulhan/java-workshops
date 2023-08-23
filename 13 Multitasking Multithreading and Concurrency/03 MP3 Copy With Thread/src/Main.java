
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    private static ArrayList<Integer> content = new ArrayList<Integer>();

    public static void readFile() {

        try {
            FileInputStream in = new FileInputStream("file.mp3");

            int read;

            while ((read = in.read()) != -1) {

                content.add(read);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void copy(String fileName) {

        try {
            FileOutputStream out = new FileOutputStream(fileName);

            for (int value : content) {

                out.write(value);

            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static void main(String[] args) {
        readFile();

        Thread thread1 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("file1.mp3");
            }
        });
        Thread thread2 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("file2.mp3");
            }
        });
        Thread thread3 = new Thread(new Runnable() {
            @Override
            public void run() {
                copy("file3.mp3");
            }
        });

        long start = System.currentTimeMillis();
        thread1.start();
        thread2.start();
        thread3.start();

        try {
            thread1.join();
            thread2.join();
            thread3.join();
        } catch (InterruptedException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
        long finish = System.currentTimeMillis();

        System.out.println("Copied 3 file in " + ((finish - start) / 1000) + " seconds.");

    }
}