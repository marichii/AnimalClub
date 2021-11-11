package mobs;
import Game.*;

public class glare extends mob{
//glare stats
  public glare (String name) {
    super(name);
  }
  
  public int creatureHP(){
    return 25;
  }
  public int creatureATK(){
    return 13;
  }
  public int creatureDEF(){
    return 9 + Game.defBuff;
  }
}