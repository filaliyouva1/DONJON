package fil.coo.item;
import fil.coo.character.Player;
/**
*Item interface.
*/
public interface Item{
  /**
  *Makes the Player p use this item
  *@param p the Player to use this Item.
  */
  public void usedBy(Player p);

  // /**
  // *Return the bonus that the Item gives. (Coded just for tests)
  // *@return the bonus that this Item gives the Player.
  // */
  // public int getBonus();

  /**
  *Returns a description of this Item.
  *@return String representation of this Item.
  */
  public String toString();
}
