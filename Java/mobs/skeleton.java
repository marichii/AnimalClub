package mobs;
public class skeleton extends mob{
  
  public skeleton (String name) {
    super(name);
  }
  public int creatureHP(){
    return 40;
  }
  public int creatureATK(){
    return 15;
  }
  public int creatureDEF(){
    return 6;
  }
  public int creatureSPD(){
    return 13;
  }
  public void creatureEnvironment(){
  }
}