
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SaveGame {

    public static void saveGame(Card[][] cards) {

        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("save.bin"))) {
            System.out.println("Saving game...");

            out.writeObject(cards);

        } catch (IOException ex) {
            Logger.getLogger(SaveGame.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    public static Card[][] loadFromSave() {

        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("save.bin"))) {

            Card[][] output = (Card[][]) in.readObject();

            return output;

        } catch (IOException ex) {
            Logger.getLogger(SaveGame.class.getName()).log(Level.SEVERE, null, ex);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(SaveGame.class.getName()).log(Level.SEVERE, null, ex);
        }
        return null;

    }

}
