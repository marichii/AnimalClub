package items;
public class shield extends item {

   public shield (String name) {
    super(name);
  }
  public int itemATK(){
    return 0;
  }
  public int itemHP(){
    return 0;
  }
    public int itemDEF(){
    return 10;
  }
  public int itemSPD(){
    return -10;
  }
}