package mobs;
import Game.*;

public class blaze extends mob{
//blaze stats
  public blaze (String name) {
    super(name);
  }
  public int creatureHP(){
    return 35 + Game.hpBuff;
  }
  public int creatureATK(){
    return 10;
  }
  public int creatureDEF(){
    return 8;
  }

  public void creatureEnvironment(){
  }
}