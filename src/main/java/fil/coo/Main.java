package fil.coo;


import fil.coo.character.*;
import fil.coo.action.*;
import fil.coo.item.*;
import fil.coo.room.*;
import fil.coo.direction.*;


public class Main {
    public static void main( String[] args ) throws java.lang.InterruptedException{
        System.out.println("Hello brave warrior to the Dungeon of Death.");
        System.out.println("This Dungeon is full of deadly Monsters and confusing paths.");
        System.out.println("Only 3% of people who enter this game get out of it alive.");
    		System.out.println("The game begins...");
        //Player initialisation
    		Player pl = new Player("Warrior",10, 10, 15);

        //Items initialisation
    		LPPotion lifePotion = new LPPotion(5);
    		StrengthPotion strengthPotion = new StrengthPotion(5);
    		Gold goldPurse = new Gold(5);
    		OneArmedBandit bandito = new OneArmedBandit();

        //Monsters initialisation
    		Monster m1 = new Monster("Dark Magician",3, 5, 2);
    		Monster m2 = new Monster("Jinzo",2, 3, 20);
        Monster m3 = new Monster("Obelisk",10, 3, 5);
        Monster m4 = new Monster("Exodia",20, 20, 99);

        //Rooms initialisation
    	  Room exit = new Exit();
    		Room r1 = new Room(goldPurse);
        Room r2 = new Room(m1,lifePotion);
        Room r3 = new Room(m1,lifePotion);
        Room r4 = new Room(m2,strengthPotion);
        r4.addItem(lifePotion);
        Room r5 = new Room(m3,bandito);
        Room r6 = new Room(m2,strengthPotion);
        Room r7 = new Room(m4);
        r7.addMonster(m4);
        r7.addItem(lifePotion);
        r7.addItem(lifePotion);
        r7.addItem(lifePotion);
        Room r8 = new Room(m4);
        r8.addItem(lifePotion);
        r8.addItem(lifePotion);

        r1.addDirection(Direction.NORTH,r3);
        r3.addDirection(Direction.SOUTH,r1);
        r1.addDirection(Direction.EAST,r2);
        r2.addDirection(Direction.WEST,r1);
        r3.addDirection(Direction.NORTH,r4);
        r4.addDirection(Direction.SOUTH,r3);
        r3.addDirection(Direction.EAST,r5);
        r5.addDirection(Direction.WEST,r3);
        r2.addDirection(Direction.EAST,r6);
        r6.addDirection(Direction.WEST,r2);
        r2.addDirection(Direction.NORTH,r5);
        r5.addDirection(Direction.SOUTH,r2);
        r5.addDirection(Direction.NORTH,r7);
        r7.addDirection(Direction.SOUTH,r5);
        r6.addDirection(Direction.NORTH,r8);
        r8.addDirection(Direction.SOUTH,r6);
        r8.addDirection(Direction.NORTH,exit);
        exit.addDirection(Direction.SOUTH,r8);
        r5.addDirection(Direction.EAST,r8);
        r8.addDirection(Direction.WEST,r5);
        r7.addDirection(Direction.EAST,exit);
        exit.addDirection(Direction.WEST,r7);

        //Game initialisation
    		AdventureGame ag = new AdventureGame(r1);
    		ag.play(pl);

        //Game Over condition
    		while(!ag.isFinished()) {
          ag.changePosActions();
    			pl.act();

    		}

        System.out.println("Game Over!");
    		if(pl.isDead()) {
    			System.out.println("You dead, you noob.");
    		}
    		else
    			System.out.println("Congratulations You've won the game, You've found the hidden Exit Room.");

    }
}
