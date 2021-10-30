public class golem extends mob implements ICombatible {
 
  public int creatureHP(){
    return 55;
  }
  public int creatureATK(){
    return 30;
  }
  public int creatureDEF(){
    return 13;
  }
  public int creatureSPD(){
    return 9;
  }
  public void creatureEnvironment(){
  }
  public String getCreature(){
    return "golem";
  }
}
//high def + high atk, low spd