package fil.coo.action;
import fil.coo.character.Player;
import fil.coo.item.*;
import fil.coo.room.*;
import java.util.*;
import fil.coo.*;
import java.util.concurrent.TimeUnit;

public class MockAction implements Action{


  public MockAction(){
  }

  public boolean isPossible(){
    return true;
  }

  public void doExecute(Player p){
  }

  public String toString(){
    return "Mock";
  }
}
