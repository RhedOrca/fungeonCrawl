package dungeonBuilder;

import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

import fungeonCrawl.AbstractRoom;
import fungeonCrawl.Room;
import java.util.Random;

public class DungeonBuilder {
	public static void buildDungeon(int dungeonLength) {
		Random rand = new Random();
		int inProgressRoomID = 1;
		AbstractRoom Room0 = new Room(false, 0);
		AbstractRoom currentRoom = Room0;
		while (inProgressRoomID < dungeonLength) {
			int buildDirection = rand.nextInt(4);
			if (buildDirection == 0) {
				currentRoom.North = new Room(false, inProgressRoomID);
				currentRoom.next = currentRoom.North;
				currentRoom = currentRoom.North;

			}
			else if (buildDirection == 1) {
				currentRoom.South = new Room(false, inProgressRoomID);
				currentRoom.next = currentRoom.South;
				currentRoom = currentRoom.South;

			}
			else if (buildDirection == 2) {
				currentRoom.East = new Room(false, inProgressRoomID);
				currentRoom.next = currentRoom.East;
				currentRoom = currentRoom.East;
			}
			else {
				currentRoom.West = new Room(false, inProgressRoomID);
				currentRoom.next = currentRoom.West;
				currentRoom = currentRoom.West;
			}


			inProgressRoomID++;
		}
		currentRoom = Room0;
		while (currentRoom.next != null) {
			currentRoom.populate();
			currentRoom.roomReport();
		}
	}
}
