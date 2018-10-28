package fil.coo.action;
import java.util.*;
import fil.coo.room.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import fil.coo.item.*;
import fil.coo.AdventureGame;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;
import java.io.*;




public class MoveActionTest extends ActionTest{
  private Room r=new Room();
  private AdventureGame g=new AdventureGame(r);
  private Player p=new Player("test",10,10,10);

  public Action createAction(){

    Item i=new MockItem();
    Room r1=new Room(i);
    r.addDirection(Direction.EAST,r1);
    r1.addDirection(Direction.WEST,r);
    g.play(p);
    return new MoveAction(g,r);
  }

  public void isPossible1(Action e){
    assertTrue(e.isPossible());
    Item i=new MockItem();
    Room r1=new Room(i);
    r1.addDirection(Direction.WEST,r);
    Action n=new MoveAction(g,r1);
    assertFalse(n.isPossible());
  }

  public void doExecute1(Action e) throws java.lang.InterruptedException{
    // Room tmp=g.currentRoom();
    // System.setIn(new ByteArrayInputStream("1".getBytes()));
    // e.doExecute(p);
    //
    // assertFalse(tmp.equals(g.currentRoom()));
  }
}
