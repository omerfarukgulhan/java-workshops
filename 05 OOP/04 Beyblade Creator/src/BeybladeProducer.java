
public class BeybladeProducer {

    public Beyblade produceBeyblade(String beybladeType) {

        if (beybladeType.equals("Dragon")) {
            return new Dragon("Takao", 800, 300, "Blue Dragon", "Speak With Monster");

        } else if (beybladeType.equals("Dranza")) {

            return new Dranza("Kai", 600, 400, "Red Phoenix");

        } else if (beybladeType.equals("Drayga")) {

            return new Dranza("Rei", 800, 250, "White Tiger");

        } else if (beybladeType.equals("Draciel")) {

            return new Dranza("Max", 400, 1000, "Black turtle");

        } else {
            return null;

        }

    }
}
