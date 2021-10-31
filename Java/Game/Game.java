package Game;
import  mobs.*;
import  combat.*;
import user.player;

public class Game{


    public static void game(player p1, player p2) {
    mob Player1 = getObj(p1.className);
    mob Player2 = getObj(p2.className);
    String player1item = p1.itemName;
    String player2item = p2.itemName;
    System.out.println( Player1.getCreature() + " " +Player1.creatureATK() + " " + player1item + " P1");

    System.out.println( Player2.getCreature()+ " " + Player2.creatureATK() + " " + player2item + " CPU");


    }


  public static mob getObj(String mob) {

    mob b = new blaze();
    switch (mob.toUpperCase()) {
      case "SLIME":
      b = new slime();
      break;
      case "GOLEM":
      b = new golem();
      break;
      case "ENDERMAN":
      b = new enderman();
      break;
      case "GLARE": 
      b = new glare();
      break;
      case "SKELETON":
      b = new skeleton();
      break;
      case "SPIDER":
      b = new spider();
      break;
      case "ZOMBIE":
      b = new zombie();
      break;
    }
    return b;

  }

}