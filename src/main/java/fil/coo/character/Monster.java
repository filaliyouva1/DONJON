package fil.coo.character;
import fil.coo.action.*;
import fil.coo.item.*;
import fil.coo.ListChoser;
import java.util.*;
public class Monster extends Character{
	/**
	 * Makes a player with a specified amounts of name, strength, LP and gold
	 * @param name this Player's name
	 * @param LP this Player's life points.
	 * @param Strength this Player's strength
	 * @param Gold this Player's gold
	 */
	public Monster(String name, int LP, int Strength,int Gold) {
		super(name,LP,Strength,Gold);
	}

	public String toString(){
		return this.name;
	}

}
