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




public class AttackActionTest extends ActionTest{
  private Monster m=new Monster("test",10,10,10);
  private Room r=new Room(m);
  private AdventureGame g=new AdventureGame(r);
  private Player p=new Player("test",10,10,10);

  public Action createAction(){
    g.play(p);
    return new AttackAction(g,r);
  }

  public void isPossible1(Action e){
    assertTrue(e.isPossible());
    r.removeMonsters(m);
    assertFalse(e.isPossible());
  }

  public void doExecute1(Action e) throws java.lang.InterruptedException{
    // On a essayé et on a trouvé que 1 seul test de DoExecute peut être executé à la fois. Donc si vous voulez tester un doExecute particulier. Décomentez le et commentez tous les autres.
    // assertFalse(r.getMonsters().isEmpty());
    //    System.setIn(new ByteArrayInputStream("1".getBytes()));
    // e.doExecute(p);
    // assertTrue(r.getMonsters().isEmpty());
  }
}
