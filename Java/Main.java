import java.util.*; //Add CPU or 2P mode

import user.*;
import Game.*;

import java.util.Random;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InterruptedException { //see while loops below to see explanation of "throws ClassNotFoundException"
        Game g = new Game();
        Random random = new Random(); //Creating an instance of the random class
        Scanner sc = new Scanner(System.in); //creating scanner instance, used for taking user input
        boolean isAlone = true;
        String envio, characterItem, Character; //creating variables that will hold a value each respective category

        String[] mobs = {"zombie", "spider", "slime", "golem", "glare", "enderman", "blaze", "skeletom"}; //a list that holds all mob/classes
        String[] items = {"ingot", "helmet", "shield", "slingshot", "burden"}; //list of items that can be chosen
        String[] environments = {"Desert", "Jungle", "Swamp", "Village"}; //environments that can be chosen in the game
        //Game starts:
        System.out.println("Welcome to AnimalClub!");
        System.out.println("Would you like to play? (SAY PLAY TO START)");
        String Character2, Character2item ;

        if (sc.nextLine().strip().equalsIgnoreCase("play")) //This if statement takes user input, and checks their answer to see if they want to play
        {

            System.out.println("Firstly, would you like to play against a CPU? Or, we have a second player? (Type 'yes' if you would like to play against a CPU, 'no' for two players)" );
            if (sc.nextLine().strip().equalsIgnoreCase("no")) isAlone = false;


            System.out.println("Choose your character Player 1!");

          /*In this while loop, we check to see if the player chooses a correct mob. While it is possible to choose any mob, as there is no wrong answer,
          it is possible to choose a mob that's not listed. We must check whether a player has actually chosen a mob. There are multiple ways to do this,
          but we decided to use a try catch block. A try catch block, as the name implies, try's to do so some code and catches any error if one arises
          while doing the code.
          */
            while (true) {
                try {
                    System.out.println("Here are your options:");
                    System.out.println("Blaze" + "\t" + "Enderman" + "\t" + "Glare" +
                            "\t" + "Golem" + "\t" + "Skeleton" + "\t" + "Slime" + "\t" + "Spider" + "\t" + "Zombie");
                    Character = sc.nextLine(); //Setting character to equal a mob that the player has chosen
                    if (!isAlone) {
                        System.out.println("Your turn Player 2! Choose your character!");
                        Character2 = sc.nextLine();
                        g.getObjMob(Character2);
                    } else {
                        Character2 = mobs[random.nextInt(7)];
                    }

                    g.getObjMob(Character);
                  /*The line above is where an error may arise. The function is supposed to return an object of a specific class, however,
                  it will throw an error (specifically "ClassNotFoundException") if no class has been chosen by the end of the function, and will also run line 43.
                  See the "getObjMob" function in "AnimalClub-assignment-2/Java/Game/Game" to see exactly how this is done.
                   */

                      break; //This line can only run if no error was found. Therefore, we will break the while loop and continue on with the game

                } catch (ClassNotFoundException e) { //This will run if an error, specifically a "ClassNotFoundException" error is found anywhere in the try block.
                    System.out.println("Hey! You didn't choose a class! Maybe you spelt it wrong?");
                    //Reaching this line will mean that they didn't properly choose a mob. So, we will loop back to choosing a mob
                    if (!isAlone) {
                        System.out.println("You will both have to choose your classes again, starting with Player 1");

                    }

                    Thread.sleep(1000);
                }
            }
            System.out.println("Nice choice! What item do you want to equip?");
            //We are essentially doing the same thing that we did for mobs, but instead, items. To see explanation of how this works, refer to the try catch block above
            System.out.println("Time to choose your item Player 1!");
            while (true) {
                try {
                    System.out.println("You can only choose one.");
                    System.out.println("There is:");
                    System.out.println("Burden" + "\t" + "Helmet" + "\t" + "Ingot" + "\t" + "Shield" + "\t" + "Slingshot");
                    characterItem = sc.nextLine(); //setting characterItem to equal an item that the player has chosen
                    if (!isAlone) {
                        System.out.println("Your turn Player 2! Choose your item!");
                        Character2item = sc.nextLine();
                        g.getObjItem(Character2item);
                    } else {
                        Character2item = items[random.nextInt(5)];
                    }

                    g.getObjItem(characterItem);
                    break;
                } catch (ClassNotFoundException e) {
                    System.out.println("Hey! You didn't choose a item! Maybe you spelt it wrong?");
                    if (!isAlone) {
                        System.out.println("You will both have to choose your items again, starting with Player 1");
                    }
                }
            }

            envio = environments[random.nextInt(3)]; //Generating a random environment to be chosen from the list, then saving the value into a variable
            System.out.println("The environment will be: " + envio);
            System.out.println("Player 1! You chose " + Character + ", with your item being " + characterItem + "!"  );
            System.out.println("Player 2! You chose " + Character2 + ", with your item being " + Character2item + "!"  );
            Thread.sleep(2000);

            g.game(envio, characterItem, Character, Character2item, Character2);
            /*At this point, we now have everything to actually start the game. Hence, we
            will be moving to the game function, found in "AnimalClub-assignment-2/Java/Game/Game"
           */
        } else {
            //if for some reason the player doesn't want to play, the terminal will close
            System.out.println("Okay, Bye!");
            System.exit(0); //this line shuts down the terminal
        }
    }


}