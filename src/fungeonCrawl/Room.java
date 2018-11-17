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

	}
}
	    
