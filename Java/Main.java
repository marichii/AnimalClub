import java.util.*; //Add CPU or 2P mode
import user.*;
import Game.*;
import java.util.Random;

public class Main {
  
  public static player P;
  public static player CPU;

    public static void main(String[] args) {
        Scanner modeChoice = new Scanner(System.in);
        Scanner characterChoice = new Scanner (System.in);
        Scanner itemChoice = new Scanner (System.in);
        String gameMode;
        String Character;
        String characterItem;
        String[] mobs = {"zombie", "spider", "slime", "golem", "glare", "enderman", "blaze", "skeletom"};
        String[] items = {"ingot", "helmet", "shield", "slingshot", "burden"};
        String[] environments = {"desert", "jungle", "swamp", "village"};
        System.out.println("Welcome to AnimalClub!");
        System.out.println("Would you like to play? (SAY PLAY TO START)");
        gameMode = modeChoice.next();

        if (gameMode.equalsIgnoreCase("play"))
        {
            System.out.println("Choose your character!");
            System.out.println("Here are your options:");
            System.out.println("Blaze" + "\t" + "Enderman" + "\t" + "Glare" +
                    "\t" + "Golem" + "\t" + "Skeleton" + "\t" + "Slime" + "\t" + "Spider" + "\t" + "Zombie");
            Character = characterChoice.next();

            System.out.println("Nice choice! What item do you want to equip?");
            System.out.println("You can only choose one.");
            System.out.println("There is:");
            System.out.println("Burden" + "\t" + "Helmet" + "\t" + "Ingot" + "\t" + "Shield" + "\t" + "Slingshot");
            characterItem = itemChoice.next();

          System.out.println("The environment will be:");
          System.out.println(environments[random.nextInt(3)]);
            Random random = new Random();
            Game.game(characterItem, Character, items[random.nextInt(4)], mobs[random.nextInt(7)]);
        }
    }  
}