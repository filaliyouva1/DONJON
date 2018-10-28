package fil.coo.action;
import fil.coo.character.Player;
import fil.coo.room.*;
import fil.coo.direction.*;
import java.util.*;
import fil.coo.*;
import java.util.concurrent.TimeUnit;


/**
*class MoveAction
*/
public class MoveAction implements Action{
  /**
  *the game
  */
  private AdventureGame game;
  /**
  *one of the game's room
  */
  private Room r;


  /**
  *Constructor of class MoveAction
  *@param game the game where this action will be executed
  *@param r the corresponding room of this action
  */
  public MoveAction(AdventureGame game,Room r){
    this.game=game;
    this.r=r;
  }

  /**
  *checks if is possible to execute this action
  *@return <code>true</code> if is possible ,<code>false</code> else
  */
  public boolean isPossible(){
    return !this.r.getDirections().isEmpty() && this.r.isEmpty();
  }


  /**
  * allows to execute this action
  * @param p the player that will be execute this action
  */
  public void doExecute(Player p) throws java.lang.InterruptedException{
    if (this.isPossible()){
      List<Direction> l = new ArrayList<Direction>(this.r.getDirections().keySet());
      ListChoser lc=new ListChoser();
      System.out.println("--------------------------------------");
      TimeUnit.SECONDS.sleep(1);
      Direction d=lc.chose("In which direction you want to move?",l);
      this.game.playerMoveTo(d);
      this.r=this.game.currentRoom();
      TimeUnit.SECONDS.sleep(1);
      System.out.println("You moved to "+d+".");
      System.out.println("Player's LP: "+p.getLP()+", Strength: "+p.getStrength()+", and Gold: "+p.getGold());
      TimeUnit.SECONDS.sleep(1);
    }else{
      TimeUnit.SECONDS.sleep(1);
      System.out.println("This Action is not possible.");
    }
    System.out.println("--------------------------------------");
  }
  public String toString(){
    return "Move";
  }
}
