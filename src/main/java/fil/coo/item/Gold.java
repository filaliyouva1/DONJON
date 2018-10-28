package fil.coo.item;
import fil.coo.character.*;
/**
*Gold Class
*/
public class Gold implements Item{
  private int gold;
  /**
  *Gold Class Constructor.
  *@param g Gold to be given to the Player who uses this Item.
  */
  public Gold(int g){
    this.gold=g;
  }
  /**
  *Makes the Player p use this Gold bag.
  *@param p the Player to use this Gold bag.
  */
  public void usedBy(Player p){
    p.addGold(this.gold);
  }
  /**
  *Return the bonus that the Item gives.
  *@return the bonus that this Item gives the Player.
  */
  public int getBonus(){
    return this.gold;
  }
  /**
  *Returns a description of this Item.
  *@return String representation of this Item.
  */
  public String toString(){
    return "Gold Bag";
  }
}
