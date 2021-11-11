package mobs;
import Game.*;

public class slime extends mob{
  //slime stats
  public slime (String name) {
    super(name);
  }
  
  public int creatureHP(){
    return 35;
  }
  public int creatureATK(){
    return 10;
  }
  public int creatureDEF(){
    return 8 + Game.defBuff;
  }
}