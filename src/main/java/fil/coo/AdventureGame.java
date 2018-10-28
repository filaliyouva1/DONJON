package fil.coo;
import fil.coo.character.*;
import fil.coo.action.*;
import fil.coo.direction.*;
import java.util.*;
import fil.coo.item.*;
import fil.coo.room.*;


/*
*class AdventureGame
*/
public class AdventureGame{
  /*
  * thee current Room of this Game
  */
  private Room currentRoom;

  /*
  * the player of this Game 
  */
  private Player player;



  /**
  * Constructor of the class AdventureGame
  * @param r the start room of the game
  */

  public AdventureGame(Room r){
    this.currentRoom=r;
  }

  /**
  * return the currentRoom of this Game
  * @return the currentRoom of this Game
  */
  public Room currentRoom(){
    return this.currentRoom;
  }
   /**
   * return the player of this game
   * @return the player of this game
   */
  public Player getPlayer(){
    return this.player;
  }


  /**
  * affects the player as a parameter to this Game
  * @param p the player that will be affected to this Game
  */
  public void play(Player p){
    this.player=p;
  }

  /**
  * adding the monster to the corresponding room in this game
  * @param m the monster that will be added
  * @param r the corresponding room where the monster is going to be added
  */
  public void addMonster(Monster m,Room r){
    r.addMonster(m);
  }


  /**
  * adding the item to the corresponding room in this game
  * @param i the item that will be added
  * @param r the corresponding room where the item is going to be added
  */
  public void addItem(Item i,Room r){
    r.addItem(i);
  }


  /**
  * checks the end of the game
  * @return <code>true</code> if the game is Finished ,<code>false</code> else

  */
  public boolean isFinished(){
    return this.player.isDead() || (this.currentRoom instanceof Exit && this.currentRoom.isEmpty());
  }


  /**
  * moving the player to the given direction in parameter
  * @param d the direction where the player will be moved
  */
  public void playerMoveTo(Direction d){
    Map<Direction,Room> dr=this.currentRoom.getDirections();
    if (!dr.containsKey(d)){
      System.out.println("You can't move in that direction.");
    }else{
      this.currentRoom=dr.get(d);
      System.out.println("You have moved to the "+d+" Room.");
      this.changePosActions();
    }
  }

  /**
  * refresh the possible actions of currentRoom of Game
  */
  public void changePosActions(){
    List<Action> a = new ArrayList<Action>();
    LookAction la=new LookAction(this.currentRoom);
    UseAction ua=new UseAction(this,this.currentRoom);
    MoveAction ma=new MoveAction(this,this.currentRoom);
    AttackAction aa=new AttackAction(this,this.currentRoom);
    if (aa.isPossible()){
      a.add(aa);
    }
    if (ma.isPossible()){
      a.add(ma);
    }
    if (ua.isPossible()){
      a.add(ua);
    }
    a.add(la);
    this.player.setposActions(a);
  }



}
