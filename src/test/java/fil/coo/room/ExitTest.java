package fil.coo.room;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import fil.coo.item.*;
import org.junit.*;
import static org.junit.Assert.*;




public class ExitTest extends RoomTest{
  public Room createEmptyRoom(){
    return new Exit ();
  }


  public Room createRoom(){
    Monster m=new Monster("test",10,10,10);
    Item i=new MockItem();
    return new Exit(m,i);
  }
}
