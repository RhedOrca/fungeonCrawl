package fungeonCrawl;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import fungeonCrawl.monsters.*;
import fungeonCrawl.Treasure;

public class Room extends AbstractRoom {

	public String adjective;
	public String roomType;
	public int RoomID;
	public boolean cleared = false;
	public ArrayList<AbstractActor> occupants = new ArrayList<AbstractActor>();
	public ArrayList<Treasure> treasures = new ArrayList<Treasure>();

	public void roomReport() {
		System.out.println("Room" + RoomID + " has " + Up + Down + North + South + East + West);
		System.out.println(occupants);
	}


	public Room(final boolean cleared, final int RoomID) {
		this.cleared = cleared;
		this.RoomID = RoomID;
		Random rand = new Random();
		int adj = rand.nextInt(3);
		int environment = rand.nextInt(5);
		if (adj == 0) {
			adjective = "an overgrown";
		}
		else if (adj == 1) {
			adjective = "a vibrant";
		}
		else if (adj == 2) {
			adjective = "a wind-swept";
		}
		else {
			adjective = "an ancient";
		}
		if (environment == 0) {
			roomType = "cave";
		}
		else if (environment == 1) {
			roomType = "forest";
		}
		else if (environment == 2) {
			roomType = "meadow";
		}
		else if (environment == 3) {
			roomType = "field of broken stones";
		}
		else {
			roomType = "rocky field";
		}
		populate();

	}

}
	    
