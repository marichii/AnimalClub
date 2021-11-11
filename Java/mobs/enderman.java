package mobs;
import Game.*;

public class enderman extends mob{
 //enderman stats
   public enderman (String name) {
    super(name);
  }

  public int creatureHP(){
    return 30;
  }
  public int creatureATK(){
    return 12 + Game.atkBuff;
  }
  public int creatureDEF(){
    return 8;
  }

  public void creatureEnvironment(){
  }
}