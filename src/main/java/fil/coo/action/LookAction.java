package fil.coo.action;
import fil.coo.character.*;
import fil.coo.direction.*;
import fil.coo.item.*;
import fil.coo.room.*;
import java.util.*;
import fil.coo.*;
import java.util.concurrent.TimeUnit;


/**
*class LookAction
*/
public class LookAction implements Action{
  /**
  *the corresponding room of this action
  */
  private Room r;


 /**
 *Constructor of class LookAction
 *@param r the room where this action will be executed
 */

  public LookAction(Room r){
    this.r=r;
  }
  /**
  *checks if is possible to execute action
  *@return <code>true</code> at all moments
  */
  public boolean isPossible(){
    return true;
  }


  /**
  * allows to execute this action
  * @param p the player that will be execute this action
  */

  public void doExecute(Player p) throws java.lang.InterruptedException{
    List<Monster> lm=this.r.getMonsters();
    int m=lm.size();
    List<Item> li=this.r.getItems();
    int i=li.size();
    List<Direction> l = new ArrayList<Direction>(this.r.getDirections().keySet());
    int z=l.size();
    System.out.println("--------------------------------------");
    TimeUnit.SECONDS.sleep(1);
    System.out.println("In your actual Room there are:");
    TimeUnit.SECONDS.sleep(1);
    System.out.println(m+" Monsters");
    TimeUnit.SECONDS.sleep(1);
    if (m!=0){
      System.out.println("Their names are:");
      for (int u=0;u<m;u++){
        TimeUnit.SECONDS.sleep(1);
        System.out.println(lm.get(u).getName()+" this monster has "+lm.get(u).getLP()+" Life Points and "+lm.get(u).getStrength()+" Strength Points. If you kill this monster, you'll get "+lm.get(u).getGold()+" Gold.");
      }
    }
    TimeUnit.SECONDS.sleep(1);
    System.out.println(i+" Items");
    if (i!=0){
      TimeUnit.SECONDS.sleep(1);
      System.out.println("And they are:");
      for (int u=0;u<i;u++){
        System.out.println(li.get(u));
      }
    }
    if (z==0){
      TimeUnit.SECONDS.sleep(1);
      System.out.println("You can't make any moves.");
    }else{
      TimeUnit.SECONDS.sleep(1);
      System.out.println("You can make one of the following "+z+" move(s):");
      for (int u=0;u<z;u++){
        TimeUnit.SECONDS.sleep(1);
        System.out.println(l.get(u));
      }
    }
    TimeUnit.SECONDS.sleep(1);
    System.out.println("Player's LP: "+p.getLP()+", Strength: "+p.getStrength()+", and Gold: "+p.getGold());
    System.out.println("--------------------------------------");
  }
  public String toString(){
    return "Look";
  }
}
