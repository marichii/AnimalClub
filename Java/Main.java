import java.util.*; //Add CPU or 2P mode
import user.*;
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

    String name = Character; 
    System.out.println("Nice choice! What item do you want to equip?");
    System.out.println("You can only choose one.");
    System.out.println("There is:");
    System.out.println("Burden" + "\t" + "Helmet" + "\t" + "Ingot" + "\t" + "Shield" + "\t" + "Slingshot");
    characterItem = itemChoice.next();

    System.out.println("The environment will be:");
    System.out.println("Player 1 will be using:");
    System.out.println("Player 2 will be using:");
    System.out.println(characterItem + name);
    P = new player(name, characterItem);
    Random random = new Random();
    CPU = new player(mobs[random.nextInt(7)], items[random.nextInt(4)]);
    System.out.println(P.getclassName());
    System.out.println(P.getitemName());
    System.out.println(CPU.getclassName());
    System.out.println(CPU.getitemName());
  }
  }
}