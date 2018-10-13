package fungeonCrawl;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Room {

	    private boolean cleared = false;
	    private ArrayList<AbstractActor> occupants = new ArrayList<AbstractActor>();
	    private ArrayList<Treasure> treasures = new ArrayList<Treasure>();

	    public Room(final boolean cleared,
	                final ArrayList<AbstractActor> occupants,
	                final ArrayList<Treasure> treasures) {
	        this.cleared = cleared;
	        this.occupants = occupants;
	        this.treasures = treasures;

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
