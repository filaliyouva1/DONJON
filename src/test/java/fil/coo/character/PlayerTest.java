package fil.coo.character;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import fil.coo.action.*;
import java.util.*;
import fil.coo.item.*;
import org.junit.*;
import static org.junit.Assert.*;



public class PlayerTest extends CharacterTest{

  private MockAction mock;
  protected Player p;


  public Character createCharacter(){
    return new Player("moha",10,10,10);
  }

  @Before
  public void init1(){

    mock=new MockAction();
    p=new Player("moha",10,10,10);
  }

  @Test
  public void getPosActionsTest(){
    assertTrue(p.getPosActions().isEmpty());
    p.addposActions(mock);
    assertFalse(p.getPosActions().isEmpty());
  }

  @Test
  public void addposActionsTest(){
    assertTrue(p.getPosActions().isEmpty());
    p.addposActions(mock);
    assertEquals(p.getPosActions().get(0),mock);
  }

  @Test
  public void removeActionTest(){
    assertTrue(p.getPosActions().isEmpty());
    p.addposActions(mock);
    assertFalse(p.getPosActions().isEmpty());
    p.removeAction(mock);
    assertTrue(p.getPosActions().isEmpty());
  }


  @Test
  public void setposActionsTest(){
    List<Action> actions=new ArrayList<Action>();
    actions.add(mock);
    p.setposActions(actions);
    assertEquals(actions,p.getPosActions());



  }
}
