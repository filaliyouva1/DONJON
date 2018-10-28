package fil.coo.item;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public class GoldTest extends ItemTest{
  public Item createItem(){
    return new Gold(5);
  }
  public void usedTest(Player p,int prev,Item i){
    assertEquals(p.getGold(),prev+5);
  }
}
