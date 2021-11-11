package Game;

import mobs.*;
import items.*;
import user.player;
import combat.*;

public class Game {
    public static int hpBuff = 0;
    public static int defBuff = 0;
    public static int atkBuff = 0;

    
    public static void game(String pEnvironment, String p1item, String p1mob, String p2item, String p2mob) throws ClassNotFoundException, InterruptedException {
        player p1 = new player(getObjMob(p1mob), getObjItem(p1item));
        player p2 = new player(getObjMob(p2mob), getObjItem(p2item));
        StatDeterminer(pEnvironment);
        System.out.println("Get ready to fight! WOOOOOOOH!");

        //game starts:
        System.out.println(combat.GeneralCombat(p1, p2));

    }

    public static mob getObjMob(String mob) throws ClassNotFoundException {
            switch (mob.toUpperCase().strip()) {
            case "SLIME":
                return new slime(mob);
            case "GOLEM":
                return new golem(mob);
            case "ENDERMAN":
                return new enderman(mob);
            case "GLARE":
                return new glare(mob);
            case "SKELETON":
                return new skeleton(mob);
            case "SPIDER":
                return new spider(mob);
            case "ZOMBIE":
                return new zombie(mob);
            case "BLAZE":
               return new blaze(mob);
            default:
                throw new java.lang.ClassNotFoundException();
        }
    }


    public static item getObjItem(String item) throws ClassNotFoundException {

        switch (item.toUpperCase().strip()) {
            case "HELMET":
                return new helmet(item);
            case "INGOT":
                return new ingot(item);
            case "SHIELD":
                return new shield(item);
            case "SLINGSHOT":
                return new slingshot(item);
            case "BURDEN":
                return new burden(item);
            default:
                throw new java.lang.ClassNotFoundException();
        }
    }

    public static void StatDeterminer(String environment) {
        switch (environment.toUpperCase()) {
            case "SWAMP":
                hpBuff += 5;
                break;
            case "VILLAGE":
                atkBuff += 5;
                break;
            case "DESERT":
                defBuff += 5;
                break;
        }
    }
}