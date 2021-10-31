package items;
public class burden extends item {

   public burden (String name) {
    super(name);
  }
  public int itemDEF(){
    return 0;
  }
  public int itemSPD(){
    return 0;
  }
  public int itemATK(){
    return 10;
  }
  public int itemHP(){
    return -5;
  }
}