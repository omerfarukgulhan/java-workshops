
public class Dragon extends Beyblade {

    private String specialMonster;
    private String specialAttack;

    public Dragon(String beybladeUser, int spinningSpeed, int attackPower, String specialMonster, String specialAttack) {
        super(beybladeUser, spinningSpeed, attackPower);
        this.specialMonster = specialMonster;
        this.specialAttack = specialAttack;

    }

    @Override
    public void showInformation() {
        super.showInformation();
        System.out.println("Special monster name: " + specialMonster);
        System.out.println("Special attack: " + specialAttack);

    }

    @Override
    public void revealSpecialMonster() {
        System.out.println(getBeybladeUser() + ": " + specialMonster);
        System.out.println(getBeybladeUser() + "'s attack: Ghost storm");

    }

}
