package fil.coo.item;
import fil.coo.character.*;
import fil.coo.item.*;
import java.util.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;
/**
*OneArmedBandit Class
*/
public class OneArmedBandit implements Item{
  private final int COST=10;
  private Item i;
  /**
  *OneArmedBandit Class Constructor, creates a new random Item and stocks it in i.
  */
  public OneArmedBandit(){
    Random r=new Random();
    int  n = r.nextInt(3) + 1;
    if (n==1){
      this.i=new Gold(r.nextInt(50)); // Donc le joueur peut perdre de l'argent
    }else if (n==2){
      this.i=new LPPotion(10);
    }else{
      this.i=new StrengthPotion(10);
    }
  }
  /**
  *Returns the Random Item that the One Armed Bandit gives the Player.
  *@return the Random Item.
  */
  public Item getItem(){
    return this.i;
  }

  /**
  *Coded for tests only
  *@return the cost to use this One Armed Bandit.
  */
  public int getCost(){
    return this.COST;
  }
  /**
  *Makes the Player p use this OneArmedBandit.
  *@param p the Player to use this OneArmedBandit.
  */
  public void usedBy(Player p){
    if (p.getGold()>=this.COST){
      System.out.println("You have enough Gold to use the One Armed Bandit.");
      System.out.println("You'll loose "+this.COST+" Gold in exchange of a random Item.");
      p.removeGold(this.COST);
      System.out.println("The One Armed Bandit gave you "+this.i+".");
      this.i.usedBy(p);
    }else{
      System.out.println("You don't have enough Gold to use the One Armed Bandit.");
    }
  }
  /**
  *Returns a description of this Item.
  *@return String representation of this Item.
  */
  public String toString(){
    return "One Armed Bandit";
  }
}
