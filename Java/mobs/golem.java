package mobs;
public class golem extends mob{
   
   public golem (String name) {
    super(name);
  }
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

}
//high def + high atk, low spd