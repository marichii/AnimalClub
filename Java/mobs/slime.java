package mobs;
public class slime extends mob{

  public int creatureHP(){
    return 35;
  }
  public int creatureATK(){
    return 10;
  }
  public int creatureDEF(){
    return 8;
  }
  public int creatureSPD(){
    return 9;
  }
  public void creatureEnvironment(){ 
  }
  public String getCreature(){
  return "slime";  
}
}