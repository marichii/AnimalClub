package environments;
import mobs.*;
public class jungle extends environment {

  public jungle (String name) {
  super(name);
  
if (name.equals("spider")) {
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

if (name.equals("skeleton")) {
  public int environmentDEF(){
    return 0;
  }
  public int environmentSPD(){
    return 0;
  }
  public int environmentATK(){
    return -5;
  }
  public int environmentHP(){
    return 0;
  }
 }
}
}