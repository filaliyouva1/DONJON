package fil.coo.item;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public class LPPotionTest extends ItemTest{
  public Item createItem(){
    return new LPPotion(5);
  }
  public void usedTest(Player p,int prev,Item i){
    assertEquals(p.getLP(),prev+5);
  }
}
