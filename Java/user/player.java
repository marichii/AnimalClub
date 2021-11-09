package user;
import mobs.*; 
import items.*;
import environments.*;
public class player {    

  public mob mob;
  public item item;
  public environment environment;

public player (mob mob, item item) {
  this.mob = mob;
  this.item = item;
}

}