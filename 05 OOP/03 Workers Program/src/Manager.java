
public class Manager extends Employee {

    private int numberOfResponsiblities;

    public Manager(String name, String surname, int id, int numberOfResponsiblities) {
        super(name, surname, id);
        this.numberOfResponsiblities = numberOfResponsiblities;
    }

    public int getNumberOfResponsiblities() {
        return numberOfResponsiblities;
    }

    public void setNumberOfResponsiblities(int numberOfResponsiblities) {
        this.numberOfResponsiblities = numberOfResponsiblities;
    }

    public void makeRaise(int amountOfRaise) {
        System.out.println("Salary increase amount: " + amountOfRaise);
    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Number of responsibilities: " + numberOfResponsiblities);
    }

}
