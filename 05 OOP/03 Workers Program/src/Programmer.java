
public class Programmer extends Employee {

    private String programmingLanguages;

    public Programmer(String name, String surname, int id, String programmingLanguages) {
        super(name, surname, id);
        this.programmingLanguages = programmingLanguages;
    }

    public String getProgrammingLanguages() {
        return programmingLanguages;
    }

    public void setProgrammingLanguages(String programmingLanguages) {
        this.programmingLanguages = programmingLanguages;
    }

    public void changeOS(String osType) {
        System.out.println("OS changed to " + osType);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Programming Languages: " + programmingLanguages);
    }

}
