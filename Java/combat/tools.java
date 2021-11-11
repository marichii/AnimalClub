package combat;

import items.item;
import mobs.mob;
import user.player;

public interface tools {

     int GeneralComabat(player p, int php);
    item getObjItem(String item) throws ClassNotFoundException;
     mob getObjMob(String mob) throws ClassNotFoundException;
}