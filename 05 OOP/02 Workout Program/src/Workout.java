
public class Workout {

    private int numberOfBurpee;
    private int numberOfPushup;
    private int numberOfSitup;
    private int numberOfSquat;

    public Workout(int numberOfBurpee, int numberOfPushup, int numberOfSitup, int numberOfSquat) {
        this.numberOfBurpee = numberOfBurpee;
        this.numberOfPushup = numberOfPushup;
        this.numberOfSitup = numberOfSitup;
        this.numberOfSquat = numberOfSquat;
    }

    public int getNumberOfBurpee() {
        return numberOfBurpee;
    }

    public void setNumberOfBurpee(int numberOfBurpee) {
        this.numberOfBurpee = numberOfBurpee;
    }

    public int getNumberOfPushup() {
        return numberOfPushup;
    }

    public void setNumberOfPushup(int numberOfPushup) {
        this.numberOfPushup = numberOfPushup;
    }

    public int getNumberOfSitup() {
        return numberOfSitup;
    }

    public void setNumberOfSitup(int numberOfSitup) {
        this.numberOfSitup = numberOfSitup;
    }

    public int getNumberOfSquat() {
        return numberOfSquat;
    }

    public void setNumberOfSquat(int numberOfSquat) {
        this.numberOfSquat = numberOfSquat;
    }

    public void startWorkout(String workuoutType, int numberOfSets) {
        if (workuoutType.equals("Burpee")) {
            doBurpee(numberOfSets);

        } else if (workuoutType.equals("Pushup")) {
            doPushup(numberOfSets);

        } else if (workuoutType.equals("Situp")) {
            doSitup(numberOfSets);

        } else if (workuoutType.equals("Squat")) {
            doSquat(numberOfSets);

        } else {
            System.out.println("Invalid Operation...");
        }

    }

    public void doBurpee(int numberOfSet) {

        if (numberOfBurpee == 0) {
            System.out.println("You alredy did all the burpees");
        } else {
            if (numberOfBurpee - numberOfSet < 0) {
                System.out.println("Congratulations, you did all the burpees");
                numberOfBurpee = 0;
                System.out.println("Number of burpees left: " + numberOfBurpee);
            } else {
                numberOfBurpee = numberOfBurpee - numberOfSet;
                System.out.println("Number of burpees left: " + numberOfBurpee);
            }
        }
    }

    public void doPushup(int numberOfSet) {

        if (numberOfPushup == 0) {
            System.out.println("You alredy did all the pushups");
        } else {
            if (numberOfPushup - numberOfSet < 0) {
                System.out.println("Congratulations, you did all the pushups");
                numberOfPushup = 0;
                System.out.println("Number of pushups left: " + numberOfPushup);
            } else {
                numberOfPushup = numberOfPushup - numberOfSet;
                System.out.println("Number of pushups left: " + numberOfPushup);
            }
        }
    }

    public void doSitup(int numberOfSet) {

        if (numberOfSitup == 0) {
            System.out.println("You alredy did all the situps");
        } else {
            if (numberOfSitup - numberOfSet < 0) {
                System.out.println("Congratulations, you did all the situps");
                numberOfSitup = 0;
                System.out.println("Number of situps left: " + numberOfSitup);
            } else {
                numberOfSitup = numberOfSitup - numberOfSet;
                System.out.println("Number of situps left: " + numberOfSitup);
            }
        }
    }

    public void doSquat(int numberOfSet) {

        if (numberOfSquat == 0) {
            System.out.println("You alredy did all the squats");
        } else {
            if (numberOfSquat - numberOfSet < 0) {
                System.out.println("Congratulations, you did all the squats");
                numberOfSquat = 0;
                System.out.println("Number of squats left: " + numberOfSquat);
            } else {
                numberOfSquat = numberOfSquat - numberOfSet;
                System.out.println("Number of squats left: " + numberOfSquat);
            }
        }
    }

    public boolean isWourkoutOver() {
        return (numberOfBurpee == 0) && (numberOfPushup == 0) && (numberOfSitup == 0) && (numberOfSquat == 0);
    }

}
