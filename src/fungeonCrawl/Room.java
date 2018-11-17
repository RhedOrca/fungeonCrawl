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
		int light = rand.nextInt(3);
		int environment = rand.nextInt(5);
		if (light == 0) {
			lightLevel = "dark";
		}
		else if (light == 1) {
			lightLevel = "dim";
		}
		else if (light == 2) {
			lightLevel = "well-lit";
		}
		else {
			lightLevel = "bright";
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
			roomType = "rocky hill";
		}
		else {
			roomType = "dry field";
		}

	}

}
	    
