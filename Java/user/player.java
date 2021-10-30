package user;
public class player{    

  public  String className;
  public  String itemName;
  public player(String className, String itemName){
    this.className = className;
    this.itemName = itemName;
  }
  public  String getclassName(){
    return className;
  }
  public  String getitemName(){
    return itemName;
  }
}