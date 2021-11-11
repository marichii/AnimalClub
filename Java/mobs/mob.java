package mobs;
import Game.*;

public abstract class mob {
  private final String name;
  public mob (String name) {
    this.name = name;
  }
  public abstract int creatureHP();
  public abstract int creatureATK();
  public abstract int creatureDEF();

  public abstract void creatureEnvironment();
  
  public String getname() {
    return this.name; 
  }
}