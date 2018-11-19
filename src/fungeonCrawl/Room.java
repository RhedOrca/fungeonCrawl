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
	public int connections;

	public void roomReport() {
		System.out.println("Room" + RoomID + " has " + Up + Down + North + South + East + West);
		System.out.println(occupants);
	}


	public Room(final boolean cleared, final int RoomID) {
		this.cleared = cleared;
		this.RoomID = RoomID;
		populate();
		Random rand = new Random();
		int adj = rand.nextInt(140);
		int environment = rand.nextInt(141);
		if (adj%14 == 0) {
			adjective = "an overgrown";
		}
		else if (adj%14 == 1) {
			adjective = "a perpetually damp";
		}
		else if (adj%14 == 2) {
			adjective = "a windswept";
		}
		else if (adj%14 == 3) {
			adjective = "an arid";
		}
		else if (adj%14 == 4) {
			adjective = "a foggy";
		}
		else if (adj%14 == 5) {
			adjective = "an unsettling";
		}
		else if (adj%14 == 6) {
			adjective = "a bleak";
		}
		else if (adj%14 == 7) {
			adjective = "a vast";
		}
		else if (adj%14 == 8) {
			adjective = "an unnaturally quiet";
		}
		else if (adj%14 == 9) {
			adjective = "a quiet and relaxing";
		}
		else if (adj%14 == 10) {
			adjective = "a tranquil";
		}
		else if (adj%14 == 11) {
			adjective = "a wide-open";
		}
		else if (adj%14 == 12) {
			adjective = "a partially flooded";
		}
		else if (adj%14 == 13) {
			adjective = "an untouched";
		}

		if (environment%15 == 0) {
			roomType = "cave";
		}
		else if (environment%15 == 1) {
			roomType = "forest";
		}
		else if (environment%15 == 2) {
			roomType = "meadow";
		}
		else if (environment%15 == 3) {
			roomType = "field of broken stone";
		}
		else if (environment%15 == 4) {
			roomType = "ancient ruin";
		}
		else if (environment%15 == 5) {
			roomType = "traveller's shelter alongside a cobble-stone road";
		}
		else if (environment%15 == 6) {
			roomType = "grassy field outside of small town";
		}
		else if (environment%15 == 7) {
			roomType = "ruins of an old crossroad";
		}
		else if (environment%15 == 8) {
			roomType = "marsh";
		}
		else if (environment%15 == 9) {
			roomType = "pit of jagged bones";
		}
		else if (environment%15 == 10) {
			roomType = "field alongside a pristine blue lake";
		}
		else if (environment%15 == 11) {
			roomType = "stand of tall reeds";
		}
		else if (environment%15 == 12) {
			roomType = "bamboo forest";
		}
		else if (environment%15 == 13) {
			roomType = "tangle of thornbrush";
		}
		else {
			roomType = "rocky field";
		}
	}

}
	    
