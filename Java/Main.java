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
    Character = characterChoice.next();

    System.out.println("Nice choice! What item do you want to equip?");
    System.out.println("You can only choose one.");
    System.out.println("There is:");
    System.out.println("Slingshot" + "\t" + "Boat" + "\t" + "Iron Ingot" + "\t" + "Shield");
    characterItem = itemChoice.next();

  }
  }
}