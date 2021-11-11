package mobs;
import Game.*;

public class enderman extends mob{
 //enderman stats
   public enderman (String name) {
    super(name);
  }
  
  //The allocated health points
  public int creatureHP(){
    return 30;
  }
  //Attack power
  public int creatureATK(){
    return 12 + Game.atkBuff;
  }
  public int creatureDEF(){
    return 8;
  }
}