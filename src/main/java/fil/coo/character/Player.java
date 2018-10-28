package fil.coo.character;
import fil.coo.action.*;
import fil.coo.item.*;
import fil.coo.ListChoser;
import java.util.*;
public class Player extends Character{
	/**
	 * The list of the player's actions
	 */
	private List<Action> posActions;
	/**
	 * Makes a player with a specified amounts of name, strength, LP and gold
	 * @param name this Player's name
	 * @param LP this Player's life points.
	 * @param Strength this Player's strength
	 * @param Gold this Player's gold
	 */
	public Player(String name, int LP, int Strength,int Gold) {
		super(name,LP,Strength,Gold);
		this.posActions = new ArrayList<Action>();
	}

	/**
	*Returns this Player's possible Actions.
	*@return this Player's possible Actions.
	*/
	public List<Action> getPosActions(){
		return this.posActions;
	}
	/**
  *Adds a new possible Action.
  *@param a Action to be added to possible actions.
  */
	public void addposActions(Action a){
		this.posActions.add(a);
	}

	/**
  *Remove an Action from this Player's possible Actions.
  *@param a Action to be removed from possible Actions.
  */
	public void removeAction(Action a){
		this.posActions.remove(a);
	}

	/**
  *Change possible Actions.
  *@param a Actions.
  */
	public void setposActions(List<Action> a){
		this.posActions=a;
	}

	public void act() throws java.lang.InterruptedException{
		ListChoser l=new ListChoser();
		Action a=l.chose("What do you want to do?",this.posActions);
		a.doExecute(this);

	}

}
