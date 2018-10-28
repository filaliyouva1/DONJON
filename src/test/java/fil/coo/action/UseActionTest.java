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




public class UseActionTest extends ActionTest{
  private Item i=new MockItem();
  private Room r=new Room(i);
  private AdventureGame g=new AdventureGame(r);
  private Player p=new Player("test",10,10,10);

  public Action createAction(){
    g.play(p);
    return new UseAction(g,r);
  }

  public void isPossible1(Action e){
    assertTrue(e.isPossible());
    r.removeItems(i);
    assertFalse(e.isPossible());
  }

  public void doExecute1(Action e) throws java.lang.InterruptedException{
    assertFalse(r.getItems().isEmpty());
    System.setIn(new ByteArrayInputStream("1".getBytes()));
    // On a essayé et on a trouvé que 1 seul test de DoExecute peut être executé à la fois. Donc si vous voulez tester un doExecute particulier. Décomentez le et commentez tous les autres.
    e.doExecute(p);
    assertTrue(r.getItems().isEmpty());
  }
}
