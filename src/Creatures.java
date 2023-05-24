public class Creatures {
    private String species;  // faj
    private int lifeForce;  // életerő
    private String position;  // pozició

    public Creatures(String species, int lifeForce, String position) {
        this.species = species;
        this.lifeForce = lifeForce;
        this.position = position;
    }

    // Getter methods
    public String getSpecies() {
        return this.species;
    }

    public int getLifeForce() {
        return this.lifeForce;
    }

    public String getPosition() {
        return this.position;
    }

    // Setter methods
    public void setSpecies(String species) {
        this.species = species;
    }

    public void setLifeForce(int lifeForce) {
        this.lifeForce = lifeForce;
    }

    public void setPosition(String position) {
        this.position = position;
    }
}
