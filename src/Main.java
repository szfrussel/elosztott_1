import java.util.Random;

public class Main {
    public static void main(String[] args) {

        Warrior warrior = new Warrior(0,1,10,10);
        Wizard wizard = new Wizard(0,3,10,"dark");

        int warriorPos;
        int wizardSPos;

        warrior.setLifeForce(getRandomNumber(6)+3);
        wizard.setLifeForce(getRandomNumber(6)+3);
        System.out.println(printBoard(warrior.getPosition(),wizard.getPosition()) + " --> H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());

        while (true){

            //pozició sorsolás
            warriorPos = getRandomNumber(3);
            wizardSPos = getRandomNumber(3);

            //van harc
            if(warriorPos == wizardSPos){
                try {
                    warrior.hurt(getRandomNumber(6));
                }catch (NoMoreLifeException e){
                    System.out.println("A Harcos meghalt");
                }
                try {
                    wizard.hurt(getRandomNumber(6));
                }catch (NoMoreLifeException e){
                    System.out.println("A Varázsló meghalt");
                }
                if(warrior.getLifeForce() == 0 | wizard.getLifeForce() == 0){
                    if(warrior.getLifeForce() == 0 & wizard.getLifeForce() ==0){
                        System.out.println(printBoard(warriorPos,wizardSPos) + " --> harc: H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());
                        System.out.println("Döntetlen!");
                    }
                    else if(warrior.getLifeForce() < 1){
                        System.out.println(printBoard(warriorPos,wizardSPos) + " --> harc: H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());
                        System.out.println("Varázsló Nyert!");
                    }
                    else{
                        System.out.println(printBoard(warriorPos,wizardSPos) + " --> harc: H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());
                        System.out.println("Harcos Nyert!");
                    }
                    System.out.println("GAME OVER");
                    break;
                }
                System.out.println(printBoard(warriorPos,wizardSPos) + " --> harc: H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());
            }
            //nincs harc
            else{
                System.out.println(printBoard(warriorPos,wizardSPos) + " --> H: "+ warrior.getLifeForce() + ", V: " + wizard.getLifeForce());

            }
        }
    }
    //random szám a pozicióhoz és a harchoz
    public static int getRandomNumber(int n) {
        Random rand = new Random();
        return rand.nextInt(n) + 1;  // 1-n közötti véletlen szám
    }
    //tábla kirajzolása
    public static String printBoard(int warriorPos, int wizardPos) {
        String[] map = {"_", "_", "_"};
        if (warriorPos == wizardPos) {
            map[warriorPos - 1] = "X";
        }
        else{
            map[warriorPos - 1] = "H";
            map[wizardPos - 1] = "V";
        }
        return map[0]+map[1]+map[2];
    }
}