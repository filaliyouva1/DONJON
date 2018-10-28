package fil.coo.action;
import fil.coo.character.*;
import fil.coo.item.*;
import fil.coo.room.*;
import java.util.*;
import fil.coo.*;
import java.util.concurrent.TimeUnit;


/**
*class AttackAction
*/
public class AttackAction implements Action{
  /**
  *the game
  */
  private AdventureGame game;

  /**
  *the corresponding room of this action
  */
  private Room r;
  /**
  *Constructor of class AttackAction
  *@param game the game where the action will be executed
  *@param r the corresponding room of the action
  */
  public AttackAction(AdventureGame game, Room r){
    this.game=game;
    this.r=r;
  }

  /**
  * checks is possible to execute the action
  * @return <code>true</code> if is possible ,<code>false</code> else
  */
  public boolean isPossible(){
    return !this.r.getMonsters().isEmpty();
  }


   /**
   * allows to execute this action
   * @param p the player that will be execute this action
   */
  public void doExecute(Player p) throws java.lang.InterruptedException{
    if (this.isPossible()){
      List<Monster> l=this.r.getMonsters();
      ListChoser lc=new ListChoser();
      System.out.println("--------------------------------------");
      TimeUnit.SECONDS.sleep(1);
      Monster m=lc.chose("What monster you wanna attack?",l);
      p.attack(m);
      TimeUnit.SECONDS.sleep(1);
      System.out.println("You attacked the Monster.");
      TimeUnit.SECONDS.sleep(1);
      if (m.isDead()){
        System.out.println("You killed the Monster.");
        this.r.removeMonsters(m);
      }else{
        System.out.println("The actual Monster Life Points are: "+m.getLP());
        m.attack(p);
        TimeUnit.SECONDS.sleep(1);
        System.out.println("The Monster riposted and attacked you back with a Attack Strength of "+m.getStrength()+".");
        TimeUnit.SECONDS.sleep(1);
        if (p.isDead()){
          System.out.println("The Monster killed you.");
        }else{
          System.out.println("You lost "+m.getStrength()+" LP");
          TimeUnit.SECONDS.sleep(2);
          System.out.println("Actual Situation:");
          TimeUnit.SECONDS.sleep(1);
          System.out.println("Player's LP: "+p.getLP()+", Strength: "+p.getStrength()+", and Gold: "+p.getGold());
          game.changePosActions();
        }
      }
      r=game.currentRoom();
    }else{
      System.out.println("This Action is not possible.");
    }
    System.out.println("--------------------------------------");
  }
  public String toString(){
    return "Attack";
  }
}
