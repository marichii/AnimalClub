package items;
public abstract class item {

  private String name;
  public item (String name) {
    this.name = name;
  }
  /*These abstract classes hold the stat
  boosts that will be applied to characters when equipped*/
  public abstract int itemHP();
  public abstract int itemATK();
  public abstract int itemDEF();
  
  public String getname() {
    return this.name; 
  }
}
