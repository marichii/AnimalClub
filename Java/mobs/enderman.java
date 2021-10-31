package mobs;
public class enderman extends mob{
 
   public enderman (String name) {
    super(name);
  }

  public int creatureHP(){
    return 30;
  }
  public int creatureATK(){
    return 12;
  }
  public int creatureDEF(){
    return 8;
  }
  public int creatureSPD(){
    return 13;
  }
  public void creatureEnvironment(){
  }
}