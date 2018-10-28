package fil.coo;
import fil.coo.character.*;
import fil.coo.action.*;
import fil.coo.direction.*;
import java.util.*;
import fil.coo.item.*;
import fil.coo.room.*;
import fil.coo.AdventureGame;
import org.junit.*;
import static org.junit.Assert.*;


public class AdventureGameTest{



  private Room r;
  private Player p;
  private Monster m;
  private AdventureGame g;


  @Before
  public void init(){
    p=new Player("moha",10,10,10);
    m=new Monster("moha",10,10,10);
    r=new Room(m);
    g=new AdventureGame(r);
    g.play(p);
  }

  @Test
  public void AdventureGameTest(){
    assertNotNull(g);
  }


@Test
public void currentRoomTest(){
  assertEquals(r,g.currentRoom());
}


@Test
public void getPlayerAndPlayTest(){
  assertEquals(p,g.getPlayer());
}
@Test
public void addMonsterTest(){
  assertEquals(g.currentRoom().getMonsters().size(),1);
  Monster m=new Monster("mohas",10,10,10);
  g.addMonster(m,g.currentRoom());
  assertEquals(g.currentRoom().getMonsters().size(),2);
  assertTrue(g.currentRoom().getMonsters().contains(m));
}

@Test
public void addItemTest(){
  assertTrue(g.currentRoom().getItems().isEmpty());
  Item i=new MockItem();
  g.addItem(i,g.currentRoom());
  assertEquals(g.currentRoom().getItems().size(),1);
  assertTrue(g.currentRoom().getItems().contains(i));
}
@Test
public void isFinishedTest(){
  assertFalse(g.isFinished());
  r.addDirection(Direction.NORTH,new Exit());
  g.playerMoveTo(Direction.NORTH);
  assertTrue(g.isFinished());
}

@Test
public void playerMoveToTest(){
  assertEquals(g.currentRoom(),r);
  Room r1=new Exit();
  List<Action> a=g.getPlayer().getPosActions();
  r.addDirection(Direction.NORTH,r1);
  g.playerMoveTo(Direction.NORTH);
  assertTrue(g.currentRoom() instanceof Exit);
  assertEquals(r1,g.currentRoom());
  assertFalse(a.equals(g.getPlayer().getPosActions()));
}

@Test
public void changePosActionsTest(){
  Room r1=new Exit();
  List<Action> a=g.getPlayer().getPosActions();
  r.addDirection(Direction.NORTH,r1);
  g.playerMoveTo(Direction.NORTH);
  assertFalse(a.equals(g.getPlayer().getPosActions()));
}

}
