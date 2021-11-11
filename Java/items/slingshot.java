package items;

public class slingshot extends item {

   public slingshot (String name) {
    super(name);
  }
  public int itemHP(){
    return 0;
  }
  public int itemATK(){
    return 10;
  }
  public int itemDEF(){
    return -10;
  }
}