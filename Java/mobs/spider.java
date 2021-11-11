package mobs;
import Game.*;

public class spider extends mob{
  //spider stats
  public spider (String name) {
    super(name);
  }

  public int creatureHP(){
    return 25 + Game.hpBuff;
  }
  public int creatureATK(){
    return 13;
  }
  public int creatureDEF(){
    return 7;
  }

  public void creatureEnvironment(){
  }
}