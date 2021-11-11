package mobs;
import Game.*;

public class skeleton extends mob{
  //skeleton stats
  public skeleton (String name) {
    super(name);
  }
  public int creatureHP(){
    return 40;
  }
  public int creatureATK(){
    return 15 + Game.atkBuff;
  }
  public int creatureDEF(){
    return 6;
  }

  public void creatureEnvironment(){
  }
}