package fungeonCrawl;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import fungeonCrawl.monsters.*;
import fungeonCrawl.Treasure;

public class Room {

	    private int RoomID;
		private boolean cleared = false;
	    private ArrayList<AbstractActor> occupants = new ArrayList<AbstractActor>();
	    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

	    public Room(final boolean cleared,
	                final int RoomID) {
	        this.cleared = cleared;
	        this.RoomID = RoomID;

	    }
	    
	    public void populate() {
	    	Random rand = new Random();
	    	int monsterID = rand.nextInt(20) + 1;
	    	int treasureID = rand.nextInt(20) + 1;
	    	if (monsterID < 7) {
	    		setCleared(true);
	    	}
	    	else if (monsterID >= 7 && monsterID < 15) {
	    		occupants.add(new Goblin("Goblin"));
	    	}
	    	else {
	    		occupants.add(new Spider("Spider"));
	    	}
	    	this.treasures.add(new Treasure(treasureID)); 
	    }
	    
	    public void roomReport() {
	    	System.out.println("Room" + RoomID + " exists.");
	    	System.out.println(getOccupants());
	    	System.out.println(getTreasure());
	    }
	    private boolean getCleared() {
	        return cleared;
	    }

	    private void setCleared(boolean cleared) {
	        this.cleared = cleared;
	    }

	    private List<AbstractActor> getOccupants() {
	        return occupants;
	    }

	    private void setOccupant(ArrayList<AbstractActor> occupants) {
	        this.occupants = occupants;
	    }

	    private List<Treasure> getTreasure() {
	        return treasures;
	    }

	    private void setTreasure(ArrayList<Treasure> treasures) {
	        this.treasures = treasures;
	    }

	    public void occupantUpdate() {
	      for (Iterator<AbstractActor> iterator = occupants.iterator(); iterator.hasNext();){
	        /*creates an iterator, iterates through list occupants as long as
	        iterator has something after it in list  */
	        AbstractActor occupant = iterator.next(); // pretty sure this is wrong
	        if (occupant.getIsAlive()) { //if alive, skip to next occupant
	        continue;
	        }
	        else {          // otherwise (dead), remove from occupant list
	          iterator.remove();
	        }
	      }
	    }
	}
