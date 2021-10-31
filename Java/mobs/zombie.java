package mobs;
public class zombie extends mob{

  public int creatureHP(){
    return 25;
  }
  public int creatureATK(){
    return 10;
  }
  public int creatureDEF(){
    return 8;
  }
  public int creatureSPD(){
    return 6;
  }
  public void creatureEnvironment(){ 
  }
  public String getCreature(){
  return "zombie";  
}
}