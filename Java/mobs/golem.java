package mobs;
import Game.*;

public class golem extends mob{
   //golem stats
   public golem (String name) {
    super(name);
  }

  public int creatureHP(){
    return 55 + Game.hpBuff;
  }
  public int creatureATK(){
    return 30;
  }
  public int creatureDEF(){
    return 13;
  }
}
