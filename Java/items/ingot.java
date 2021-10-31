package items;
public class ingot extends item {

   public ingot (String name) {
    super(name);
  }
  public int itemHP(){
    return 0;
  }
  public int itemDEF(){
    return 0;
  }
  public int itemATK(){
    return 5;
  }
  public int itemSPD(){
    return -5;
  }
}