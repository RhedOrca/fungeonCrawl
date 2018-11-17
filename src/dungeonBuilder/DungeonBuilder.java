package dungeonBuilder;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import fungeonCrawl.AbstractRoom;
import fungeonCrawl.Player;
import fungeonCrawl.Room;
import java.util.Random;

public class DungeonBuilder {
	Room Room0 = new Room(false, 0);
	public void buildDungeon(int dungeonLength, Player player) {
		Random rand = new Random();
		player.setLocation(Room0);
		int inProgressRoomID = 1;
		AbstractRoom currentRoom = Room0;
		while (inProgressRoomID < dungeonLength) {
			int buildDirection = rand.nextInt(4);
			if (buildDirection == 0) {
				currentRoom.North = new Room(false, inProgressRoomID);
				currentRoom.North.South = currentRoom;
				currentRoom.next = currentRoom.North;
				currentRoom = currentRoom.North;

			}
			else if (buildDirection == 1) {
				currentRoom.South = new Room(false, inProgressRoomID);
				currentRoom.South.North = currentRoom;
				currentRoom.next = currentRoom.South;
				currentRoom = currentRoom.South;

			}
			else if (buildDirection == 2) {
				currentRoom.East = new Room(false, inProgressRoomID);
				currentRoom.East.West = currentRoom;
				currentRoom.next = currentRoom.East;
				currentRoom = currentRoom.East;
			}
			else {
				currentRoom.West = new Room(false, inProgressRoomID);
				currentRoom.West.East = currentRoom;
				currentRoom.next = currentRoom.West;
				currentRoom = currentRoom.West;
			}


			inProgressRoomID++;
		}
		currentRoom = Room0;
		while (currentRoom != null) {
			currentRoom.populate();
			//currentRoom.roomReport();
			currentRoom = currentRoom.next;
		}
	}
}
