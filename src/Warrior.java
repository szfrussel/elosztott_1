public class Warrior extends Creatures {
    private int strength;  // erő
    private int armorStrength;  // páncélzat ereje

    public Warrior(String species, int lifeForce, String position, int strength, int armorStrength) {
        super(species, lifeForce, position);
        this.strength = strength;
        this.armorStrength = armorStrength;
    }

    // Getter methods
    public int getStrength() {
        return this.strength;
    }

    public int getArmorStrength() {
        return this.armorStrength;
    }

    // Setter methods
    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setArmorStrength(int armorStrength) {
        this.armorStrength = armorStrength;
    }
}