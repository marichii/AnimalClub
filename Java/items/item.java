package items;
public abstract class item {

    private String name;
  public item (String name) {
    this.name = name;
  }
  public abstract int itemHP();
  public abstract int itemATK();
  public abstract int itemDEF();
  public abstract int itemSPD();
  
  public String getname() {
    return this.name; 
  }
}
