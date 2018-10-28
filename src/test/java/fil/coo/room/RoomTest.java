package fil.coo.room;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import fil.coo.item.*;
import org.junit.*;
import static org.junit.Assert.*;




public class RoomTest{
  protected Room r;
  protected Room e;

  @Before
  public void init(){
    r=createRoom();
    e=createEmptyRoom();
  }

  public Room createEmptyRoom(){
    return new Room();
  }


  public Room createRoom(){
    Monster m=new Monster("test",10,10,10);
    Item i=new MockItem();
    return new Room(m,i);
  }

  @Test
  public void RoomCreationTest(){
    assertNotNull(r);
  }

  @Test
  public void addItemTest(){
    assertTrue(e.getItems().isEmpty());
    Item i=new MockItem();
    e.addItem(i);
    assertFalse(e.getItems().isEmpty());
  }

  @Test
  public void addMonsterTest(){
    assertTrue(e.getMonsters().isEmpty());
    Monster m=new Monster("test",10,10,10);
    e.addMonster(m);
    assertFalse(e.getMonsters().isEmpty());
  }

  @Test
  public void getMonstersTest(){
    assertTrue(e.getMonsters().isEmpty());
    Monster m=new Monster("test",10,10,10);
    e.addMonster(m);
    assertEquals(e.getMonsters().get(0),m);

  }

  @Test
  public void getItemsTest(){
    assertTrue(e.getItems().isEmpty());
    Item i=new MockItem();
    e.addItem(i);
    assertEquals(e.getItems().get(0),i);

  }

  @Test
  public void addDirectionTest(){
    assertTrue(e.getDirections().isEmpty());
    e.addDirection(Direction.NORTH,r);
    assertFalse(e.getDirections().isEmpty());
  }

  @Test
  public void getDirectionsTest(){
    e.addDirection(Direction.NORTH,r);
    assertEquals(e.getDirections().get(Direction.NORTH),r);
  }


  @Test
  public void removeItemsTest(){
    assertFalse(r.getItems().isEmpty());
    r.removeItems(r.getItems().get(0));
    assertTrue(r.getItems().isEmpty());
  }

  @Test
  public void removeMonstersTest(){
    assertFalse(r.getMonsters().isEmpty());
    r.removeMonsters(r.getMonsters().get(0));
    assertTrue(r.getMonsters().isEmpty());
  }

  @Test
  public void getRoomTest(){
    r.addDirection(Direction.NORTH,e);
    assertEquals(r.getRoom(Direction.NORTH),e);

  }

  @Test
  public void isEmptyTest(){
    assertTrue(e.isEmpty());
    assertFalse(r.isEmpty());
    Monster m=new Monster("test",10,10,10);
    e.addMonster(m);
    assertFalse(e.isEmpty());
  }






}
