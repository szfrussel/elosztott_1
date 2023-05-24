public class Creatures {

    private int lifeForce;  // életerő
    private int position;  // pozició

    public Creatures(int lifeForce, int position) {

        this.lifeForce = lifeForce;
        this.position = position;
    }

     public int getLifeForce() {
        return this.lifeForce;
    }

    public int getPosition() {
        return this.position;
    }

    public void setLifeForce(int lifeForce) {
        this.lifeForce = lifeForce;
    }

    public void setPosition(int position) {
        this.position = position;
    }

    public void hurt(int hurt){
        this.lifeForce -= hurt;

    }

}
