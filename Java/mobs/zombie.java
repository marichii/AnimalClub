package mobs;

import Game.*;

public class zombie extends mob {
  // zombie stats
  public zombie(String name) {
    super(name);
  }

  public int creatureHP() {
    return 25;
  }
  public int creatureATK() {
    return 10 + Game.atkBuff;
  }
  public int creatureDEF() {
    return 8;
  }
}