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

    public void hurt(int hurt) throws  NoMoreLifeException {
        if (this.lifeForce > hurt){
            this.lifeForce -= hurt;
        }
        else{
            this.lifeForce = 0;
            throw new NoMoreLifeException();

        }

        //this.lifeForce -= hurt;
       // if(this.lifeForce < 0) {this.lifeForce = 0;}

    }

}
