package fil.coo.action;
import fil.coo.character.Player;
import fil.coo.item.*;
import fil.coo.room.*;
import java.util.*;
import fil.coo.*;
import java.util.concurrent.TimeUnit;


/**
*class UseAction
*/
public class UseAction implements Action{
  /**
  *the game
  */
  private AdventureGame game;

  /**
  *one of game's rooms
  */
  private Room r;


   /**
   *Constructor of class UseAction
   *@param game the game where this action will be executed
   @param r the corresponding room of this action
   */
  public UseAction(AdventureGame game,Room r){
    this.game=game;
    this.r=r;
  }

  /**
  *checks if is possible to execute this action
  *@return <code>true</code> if is possible ,<code>false</code> else
  */
  public boolean isPossible(){
    return !this.r.getItems().isEmpty();
  }


  /**
  * allows to execute this action
  * @param p the player that will be execute this action
  */
  public void doExecute(Player p) throws java.lang.InterruptedException{
    if (this.isPossible()){
      List<Item> l=this.r.getItems();
      ListChoser lc=new ListChoser();
      System.out.println("--------------------------------------");
      TimeUnit.SECONDS.sleep(1);
      Item i=lc.chose("What Item you want to use?",l);
      i.usedBy(p);
      TimeUnit.SECONDS.sleep(3);
      System.out.println("You used "+i+".");
      r.removeItems(i);
      TimeUnit.SECONDS.sleep(2);
      System.out.println("Actual Situation:");
      TimeUnit.SECONDS.sleep(1);
      System.out.println("Player's LP: "+p.getLP()+", Strength: "+p.getStrength()+", and Gold: "+p.getGold());
      game.changePosActions();
    }else{
      System.out.println("This Action is not possible.");
    }
    System.out.println("--------------------------------------");
  }

  public String toString(){
    return "Use";
  }
}
