
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Main {

    public static ArrayList<Integer> music = new ArrayList<Integer>();

    public static void main(String[] args) {

        readFile();
        long start = System.currentTimeMillis();

        writeFile();
        long finish = System.currentTimeMillis();

        System.out.println("Copy time: " + (finish - start) / 1000);
    }

    public static void readFile() {

        try {
            FileInputStream musicInput = new FileInputStream("file.mp3");
            int value;

            while ((value = musicInput.read()) != -1) {
                music.add(value);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static void writeFile() {

        try {
            FileOutputStream musicOutput = new FileOutputStream("copy-file.mp3");

            for (int value : music) {
                musicOutput.write(value);
            }

        } catch (FileNotFoundException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
