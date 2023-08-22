
public class Beyblade {

    private String beybladeUser;
    private int spinningSpeed;
    private int attackPower;

    public Beyblade(String beybladeUser, int spinningSpeed, int attackPower) {
        this.beybladeUser = beybladeUser;
        this.spinningSpeed = spinningSpeed;
        this.attackPower = attackPower;
    }

    public String getBeybladeUser() {
        return beybladeUser;
    }

    public void setBeybladeUser(String beybladeUser) {
        this.beybladeUser = beybladeUser;
    }

    public int getSpinningSpeed() {
        return spinningSpeed;
    }

    public void setSpinningSpeed(int spinningSpeed) {
        this.spinningSpeed = spinningSpeed;
    }

    public int getAttackPower() {
        return attackPower;
    }

    public void setAttackPower(int attackPower) {
        this.attackPower = attackPower;
    }

    public void attack() {
        System.out.println(beybladeUser + " attacking with " + attackPower + " attack power and spinning with " + spinningSpeed);

    }

    public void revealSpecialMonster() {
        System.out.println("This beyblade doesn't have special monster.");

    }

    public void showInformation() {
        System.out.println("Beyblade User: " + beybladeUser);
        System.out.println("Attack Power : " + attackPower);
        System.out.println("Spinning Speed: " + spinningSpeed);

    }

}
