package fil.coo.item;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public abstract class ItemTest{

  protected Item g;
  protected Player p;

  public abstract void usedTest(Player p,int prev,Item i);
  public abstract Item createItem();

  @Before
  public void init(){
    g=createItem();
    p=new Player("test",10,10,10);
  }

  @Test
  public void ItemCreationTest(){
    assertNotNull(g);
  }

  @Test
  public void usedByTest(){
    int prev_value=10;
    g.usedBy(p);
    usedTest(p,prev_value,g);
  }
}
