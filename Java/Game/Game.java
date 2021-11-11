package Game;

import mobs.*;
import items.*;

import user.player;
import combat.*;

public class Game implements tools {
    public static int hpBuff = 0;
    public static int defBuff = 0;
    public static int atkBuff = 0;


    public void game(String pEnvironment, String p1item, String p1mob, String p2item, String p2mob)  throws ClassNotFoundException, InterruptedException   {
        player p1 = new player(getObjMob(p1mob), getObjItem(p1item));
        player p2 = new player(getObjMob(p2mob), getObjItem(p2item));
        StatDeterminer(pEnvironment);
       
        System.out.println("Get ready to fight! WOOOOOOOH!");

        //game starts:
        inBattle(p1, p2);
    }
    public void inBattle(player p1, player p2) throws InterruptedException {
        int p1hp = p1.mob.creatureHP() + p1.mob.creatureDEF() + p1.item.itemHP() + p1.item.itemDEF(), p2hp = p2.mob.creatureHP() + p2.mob.creatureDEF() + p2.item.itemHP() + p2.item.itemDEF();
        System.out.println("Player 1! Your hp will be..."); Thread.sleep(1000); System.out.println(p1hp + "!" );
        System.out.println("Player 2! Your hp will be..."); Thread.sleep(1000); System.out.println(p2hp + "!");
        Thread.sleep(1500);
        System.out.println("Player 1! You will be dealing " + (p1.mob.creatureATK() + p1.item.itemATK()) + " damage to your opponent!");
        System.out.println("Player 2! You will be dealing " + (p2.mob.creatureATK() + p2.item.itemATK()) + " damage to your opponent!");
        System.out.println("Finally, Let the games begin!");

        while (p1hp >= 0 && p2hp >= 0) {
            Thread.sleep(2000);
            p1hp = GeneralComabat(p2, p1hp);
            System.out.println("Player 2 just dealt " + (p2.mob.creatureATK() + p2.item.itemATK()) + " damage to Player 1! Player 1 currently has " + p1hp + " health!" );
            Thread.sleep(2000);

            p2hp = GeneralComabat(p1, p2hp);
            System.out.println("Player 1 just dealt " + (p1.mob.creatureATK() + p1.item.itemATK()) + " damage to Player 2! Player 2 currently has " + p2hp + " health!");

        }
        if (p1hp > p2hp){
            System.out.println("Player1 has won!"); System.exit(0); }
        if (p1hp < p2hp) {
            System.out.println("Player1 has won!");
            System.exit(0);
        }
        System.out.println("Its a Tie!");

    }

    public int GeneralComabat(player p, int php)  {
        php -= p.mob.creatureATK() + p.item.itemATK();
        return php;
    }




    public mob getObjMob(String mob) throws ClassNotFoundException {
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



    public item getObjItem(String item) throws ClassNotFoundException {

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