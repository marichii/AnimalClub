package combat;

import items.item;
import user.player;

public class combat {

    public static String GeneralCombat(player p1, player p2) throws InterruptedException {

        int p1hp = p1.mob.creatureHP() + p1.mob.creatureDEF() + p1.item.itemHP() + p1.item.itemDEF(), p2hp = p2.mob.creatureHP() + p2.mob.creatureDEF() + p2.item.itemHP() + p2.item.itemDEF();
        System.out.println("Player 1! Your hp will be..."); Thread.sleep(1000); System.out.println(p1hp + "!" );
        System.out.println("Player 2! Your hp will be..."); Thread.sleep(1000); System.out.println(p2hp + "!");
        Thread.sleep(1500);
        System.out.println("Player 1! You will be dealing " + (p1.mob.creatureATK() + p1.item.itemATK()) + " damage to your opponent!");
        System.out.println("Player 2! You will be dealing " + (p2.mob.creatureATK() + p2.item.itemATK()) + " damage to your opponent!");
        System.out.println("Finally, Let the games begin!");

        while (p1hp >= 0 && p2hp >= 0) {
            Thread.sleep(2000);
            p1hp -= p2.mob.creatureATK() + p2.item.itemATK();
            System.out.println("Player 2 just dealt " + (p2.mob.creatureATK() + p2.item.itemATK()) + " damage to Player 1! Player 1 currently has " + p1hp + " health!" );
            Thread.sleep(2000);
            p2hp -= p1.mob.creatureATK() + p1.item.itemATK();
            System.out.println("Player 1 just dealt " + (p1.mob.creatureATK() + p1.item.itemATK()) + " damage to Player 2! Player 2 currently has " + p2hp + " health!");

        }
        if (p1hp > p2hp) return "Player one has won!";
        if (p1hp < p2hp) return "Player two has won!";

        return "TIE!";
    }


}