public class Wizard extends Creatures {
    private int magicPower;  // varázserő
    private String side;  // oldal (jó vagy gonosz)

    public Wizard(String species, int lifeForce, String position, int magicPower, String side) {
        super(species, lifeForce, position);
        this.magicPower = magicPower;
        this.side = side;
    }

    // Getter methods
    public int getMagicPower() {
        return this.magicPower;
    }

    public String getSide() {
        return this.side;
    }

    // Setter methods
    public void setMagicPower(int magicPower) {
        this.magicPower = magicPower;
    }

    public void setSide(String side) {
        this.side = side;
    }
}