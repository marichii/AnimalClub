package environments; 
import mobs.*;
public abstract class environment {
  
  private String name;
  public environment (String name) {
    this.name = name;
  }
  public abstract int environmentHP();
  public abstract int environmentATK();
  public abstract int environmentDEF();
   
    public String getname() {
    return this.name; 
  }
}
