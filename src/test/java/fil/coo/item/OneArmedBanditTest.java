package fil.coo.item;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public class OneArmedBanditTest extends ItemTest{
  public Item createItem(){
    return new OneArmedBandit();
  }
  public void usedTest(Player p,int prev,Item i){
    OneArmedBandit it=(OneArmedBandit) i;
    i=it.getItem();
    if (i instanceof StrengthPotion){
      StrengthPotion u=(StrengthPotion) i;
      assertEquals(p.getStrength(),prev+u.getBonus());
    }else if (i instanceof Gold){
      Gold u=(Gold) i;
      assertEquals(p.getGold(),prev+u.getBonus()-it.getCost());
    }else if (i instanceof LPPotion){
      LPPotion u=(LPPotion) i;
      assertEquals(p.getLP(),prev+u.getBonus());
    }

  }
}
