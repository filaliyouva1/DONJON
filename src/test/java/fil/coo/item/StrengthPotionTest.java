package fil.coo.item;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public class StrengthPotionTest extends ItemTest{
  public Item createItem(){
    return new StrengthPotion(5);
  }
  public void usedTest(Player p,int prev,Item i){
    assertEquals(p.getStrength(),prev+5);
  }
}
