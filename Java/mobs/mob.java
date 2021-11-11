package mobs;
import Game.*;

public abstract class mob {
  private final String name;
  public mob (String name) {
    this.name = name;
  }
  //Health points, attack power, and defense of creatures
  public abstract int creatureHP();
  public abstract int creatureATK();
  public abstract int creatureDEF();
  
  public String getname() {
    return this.name; 
  }
}