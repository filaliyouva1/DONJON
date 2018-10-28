package fil.coo.room;
import fil.coo.character.*;
import fil.coo.item.*;


public class Exit extends Room {



	public Exit(Monster monster,Item item){
			super(monster,item);

	}


	public Exit(Item item){
		  super(item);

	}




	public Exit(Monster monster){
	   	super(monster);

	}

	public Exit(){
			super();
	}


}
