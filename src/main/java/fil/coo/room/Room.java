package fil.coo.room;
import java.util.*;
import fil.coo.direction.*;
import fil.coo.character.*;
import java.util.*;
import fil.coo.item.*;


public class Room {
	protected Map<Direction,Room> directions=new HashMap<Direction,Room>();
	protected List<Monster> monsters=new ArrayList<Monster>();
	protected List<Item> items=new ArrayList<Item>();



	public Room(Monster monster,Item item){
			this.monsters.add(monster);
			this.items.add(item);

	}


	public Room(Item item){
			this.items.add(item);
	}




	public Room(Monster monster){
			this.monsters.add(monster);

	}

	public Room(){

	}










	public void addItem(Item i){
		this.items.add(i);
	}

	public void addMonster(Monster m){
		this.monsters.add(m);
	}

	public void addDirection(Direction d,Room r){
		this.directions.put(d,r);
	}

	public List<Item> getItems(){
		return this.items;
	}


	public List<Monster> getMonsters(){
		return this.monsters;
	}

	public Map<Direction,Room> getDirections(){
		return this.directions;
	}

	public void removeItems(Item i){
		this.items.remove(i);
	}

	public void removeMonsters(Monster m){
		this.monsters.remove(m);
	}

	public Room getRoom(Direction d){
		return this.directions.get(d);
	}

	public boolean isEmpty(){
		return this.monsters.isEmpty() && this.items.isEmpty();
	}
}
