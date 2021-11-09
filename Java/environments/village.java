package environments;
import mobs.*;
public class village extends environment {

  public village (String name) {
  super(name);
  }
  public int environmentDEF(){
    return 0;
  }
  public int environmentSPD(){
    return 0;
  }
  public int environmentATK(){
    return 5;
  }
  public int environmentHP(){
    return 0;
  }
}
