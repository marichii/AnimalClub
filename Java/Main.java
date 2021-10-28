import java.util.*; //Add CPU or 2P mode

public class Main {
  
  public static void main(String[] args) {
  Scanner modeChoice = new Scanner(System.in);
  Scanner characterChoice = new Scanner (System.in);
  Scanner itemChoice = new Scanner (System.in);
  String gameMode;
  String Character;
  String characterItem;

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
    System.out.println("Slingshot" + "\t" + "Helmet" + "\t" + "Iron Ingot" + "\t" + "Shield");
    characterItem = itemChoice.next();

  }
  }
}