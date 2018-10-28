package fil.coo.item;
import fil.coo.character.*;
/**
*LPPotion (Life Points Potion) Class.
*/
public class LPPotion implements Item{
  private int LP;
  /**
  *LPPotion Class Constructor.
  *@param LP the amount of LP to add to the Player who'll use this LPPotion.
  */
  public LPPotion(int LP){
    this.LP=LP;
  }
  /**
  *Return the bonus that the Item gives.
  *@return the bonus that this Item gives the Player.
  */
  public int getBonus(){
    return this.LP;
  }
  /**
  *Makes the Player p use this LPPotion.
  *@param p the Player to use this LPPotion.
  */
  public void usedBy(Player p){
    p.addLP(this.LP);
  }
  /**
  *Returns a description of this Item.
  *@return String representation of this Item.
  */
  public String toString(){
    return "Life Points Potion";
  }
}
