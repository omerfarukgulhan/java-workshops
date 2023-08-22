
public class Draciel extends Beyblade {

    private String specialMonster;

    public Draciel(String beybladeUser, int spinningSpeed, int attackPower, String specialMonster) {
        super(beybladeUser, spinningSpeed, attackPower);
        this.specialMonster = specialMonster;

    }

    @Override
    public void showInformation() {
        super.showInformation(); 
        System.out.println("Special monster name:" + specialMonster);

    }

    @Override
    public void revealSpecialMonster() {
        System.out.println(getBeybladeUser() + ": " + specialMonster);
        System.out.println(getBeybladeUser() + "'s defence: Castle defense");

    }

}
