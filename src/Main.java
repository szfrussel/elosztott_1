import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior(100,1,10,10);
        Wizard wizard = new Wizard(100,3,10,"dark");

        int attack;


        boolean everyBodyStand = true;
        while (everyBodyStand){


            System.out.println(warrior.getLifeForce());
            attack = getRandomNumber(6);
            warrior.hurt(attack);



            if(warrior.getLifeForce()<1 | wizard.getLifeForce()<1){
                everyBodyStand = false; // valaki meghalt
                System.out.println("GAME OVER");
            }
        }
    }

    public static int getRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;  // 1-n közötti véletlen szám
    }
}