package fil.coo.action;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import org.junit.*;
import static org.junit.Assert.*;




public abstract class ActionTest{

  protected Action a;

  public abstract Action createAction();
  public abstract void doExecute1(Action a) throws java.lang.InterruptedException;
  public abstract void isPossible1(Action a);

  @Before
  public void init(){
    a=createAction();
  }

  @Test
  public void ActionCreationTest(){
    assertNotNull(a);
  }

  @Test
  public void isPossibleTest(){
    isPossible1(a);
  }

  @Test
  public void doExecuteTest() throws java.lang.InterruptedException{
    doExecute1(a);
  }
}
