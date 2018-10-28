package fil.coo.action;
import fil.coo.character.Player;

/**
*Action interface
*/
public interface Action{

  public boolean isPossible();

  public void doExecute(Player p) throws java.lang.InterruptedException;
}
