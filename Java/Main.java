import java.util.*; //Add CPU or 2P mode

public class Main {
  
  public static void main(String[] args) {
  Scanner modeChoice = new Scanner(System.in);
  Scanner characterChoice = new Scanner (System.in);
  Scanner itemChoice = new Scanner (System.in);
  String gameMode;
  String Character;

  System.out.println("Welcome to AnimalClub!");
  System.out.println("Would you like to play? (SAY PLAY TO START)");
  gameMode = modeChoice.next();

  if (gameMode.equalsIgnoreCase("play"))
  {
    System.out.println("Choose your character!");
    Character = characterChoice.next();

    System.out.println("Nice choice!");
    System.out.println("What item do you want to equip? You can only choose one.");
    System.out.println()
    Character = itemChoice.next();
  }
  }
}