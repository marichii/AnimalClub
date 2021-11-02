package environments;
import mobs.*;
public class swamp extends environment {

  public swamp (String name) {
  super(name);
  
if (name.equals("slime")) {
  public int environmentDEF(){
    return 0;
  }
  public int environmentSPD(){
    return 0;
  }
  public int environmentATK(){
    return 0;
  }
  public int environmentHP(){
    return 5;
  }
 }

if (name.equals("blaze")) {
  public int environmentDEF(){
    return 0;
  }
  public int environmentSPD(){
    return 0;
  }
  public int environmentATK(){
    return 0;
  }
  public int environmentHP(){
    return -5;
  }
 }
}
}