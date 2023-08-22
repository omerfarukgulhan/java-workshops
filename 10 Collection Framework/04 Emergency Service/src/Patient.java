
public class Patient implements Comparable<Patient> {

    private String name;
    private String ilness;
    private int priority;

    public Patient(String name, String ilness) {
        this.name = name;
        this.ilness = ilness;

        if (ilness.equals("Bleeding")) {
            this.priority = 3;
        } else if (ilness.equals("Burn")) {
            this.priority = 2;
        } else {
            this.priority = 1;

        }

    }

    @Override
    public String toString() {

        String informations = " Patient name: " + name
                + "\nIlness: " + ilness
                + "\nPriority: " + priority;

        return informations;

    }

    @Override
    public int compareTo(Patient patient) {

        if (this.priority > patient.priority) {

            return -1;

        } else if (this.priority < patient.priority) {
            return 1;
        } else {
            return 0;
        }

    }

}
