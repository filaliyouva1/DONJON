package fil.coo.item;
import fil.coo.character.*;
/**
*StrengthPotion Class.
*/
public class StrengthPotion implements Item{
  private int SP;
  /**
  *StrengthPotion Class Constructor.
  *@param SP the ammount of Strength to be added to the Player who'll use this StrengthPotion.
  */
  public StrengthPotion(int SP){
    this.SP=SP;
  }
  /**
  *Return the bonus that the Item gives.
  *@return the bonus that this Item gives the Player.
  */
  public int getBonus(){
    return this.SP;

  }
  /**
  *Makes the Player p use this StrengthPotion.
  *@param p the Player to use this StrengthPotion.
  */
  public void usedBy(Player p){
    p.addStrength(this.SP);
  }
  /**
  *Returns a description of this Item.
  *@return String representation of this Item.
  */
  public String toString(){
    return "Strength Potion";
  }
}
