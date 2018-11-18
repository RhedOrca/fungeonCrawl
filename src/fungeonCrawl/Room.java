package fungeonCrawl;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Random;
import fungeonCrawl.monsters.*;
import fungeonCrawl.Treasure;

public class Room extends AbstractRoom {


	public Room(final boolean cleared,
				final int RoomID) {
		this.cleared = cleared;
		this.RoomID = RoomID;
		Random rand = new Random();
		int adj = rand.nextInt(3);
		int environment = rand.nextInt(5);
		if (adj == 0) {
			adjective = "overgrown";
		}
		else if (adj == 1) {
			adjective = "vibrant";
		}
		else if (adj == 2) {
			adjective = "barren";
		}
		else {
			adjective = "ancient";
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

	}

}
	    
