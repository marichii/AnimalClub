package environments;
import mobs.*;
public class desert extends environment {

  public desert (String name) {
  super(name);
  
if (name.equals("zombie")) {
  public int environmentDEF(){
    return 0;
  }
  public int environmentSPD(){
    return 5;
  }
  public int environmentATK(){
    return 0;
  }
  public int environmentHP(){
    return 0;
  }
 }

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
    return -5;
  }
 }
}
}