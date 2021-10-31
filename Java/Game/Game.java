package Game;
import mobs.*;
import items.*; 
import combat.*;
import user.player;

public class Game {

    public static void game(String p1item, String p1mob, String p2item, String p2mob) {
    player p1 = new player(getObjMob(p1mob), getObjItem(p1item));
    player p2 = new player(getObjMob(p2mob), getObjItem(p2item));
//to access item, p1.item | to access mob, p1.mob 
System.out.println(p1.mob.getname());
System.out.println(p1.item.getname());
System.out.println(p2.mob.getname());
System.out.println(p2.item.getname());
    }

  public static mob getObjMob(String mob) {

    mob b = new blaze(mob);
    switch (mob.toUpperCase()) {
      case "SLIME":
      b = new slime(mob);
      break;
      case "GOLEM":
      b = new golem(mob);
      break;
      case "ENDERMAN":
      b = new enderman(mob);
      break;
      case "GLARE": 
      b = new glare(mob);
      break;
      case "SKELETON":
      b = new skeleton(mob);
      break;
      case "SPIDER":
      b = new spider(mob);
      break;
      case "ZOMBIE":
      b = new zombie(mob);
      break;
    }
    return b;
  }

  public static item getObjItem(String item) {

    item i = new burden(item);
    switch (item.toUpperCase()) {
      case "HELMET":
      i = new helmet(item);
      break;
      case "INGOT":
      i = new ingot(item);
      break;
      case "SHIELD":
      i = new shield(item);
      break;
      case "SLINGSHOT": 
      i = new slingshot(item);
      break;
    }
    return i;

  }
}