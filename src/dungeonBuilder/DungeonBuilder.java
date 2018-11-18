package dungeonBuilder;


import fungeonCrawl.AbstractRoom;
import fungeonCrawl.Player;
import fungeonCrawl.Room;
import java.util.*;
import java.util.ArrayList;

public class DungeonBuilder {
	Room Room0 = new Room(false, 0);
	public void buildDungeon(int dungeonLength, Player player) {
		Room[] dungeon = new Room[dungeonLength+2];
		dungeon[0] = Room0;
		Random rand = new Random();
		player.setLocation(Room0);
		int inProgressRoomID = 1;
		AbstractRoom currentRoom = Room0;
		while (inProgressRoomID < dungeonLength) {
			int buildDirection = rand.nextInt(4);
			if (buildDirection == 0) {
				if (currentRoom.North != null) {continue;}
				currentRoom.North = new Room(false, inProgressRoomID);
				currentRoom.North.South = currentRoom;
				currentRoom.next = currentRoom.North;
				currentRoom = currentRoom.North;

			}
			else if (buildDirection == 1) {
				if (currentRoom.South != null) {continue;}
				currentRoom.South = new Room(false, inProgressRoomID);
				currentRoom.South.North = currentRoom;
				currentRoom.next = currentRoom.South;
				currentRoom = currentRoom.South;

			}
			else if (buildDirection == 2) {
				if (currentRoom.East != null) {continue;}
				currentRoom.East = new Room(false, inProgressRoomID);
				currentRoom.East.West = currentRoom;
				currentRoom.next = currentRoom.East;
				currentRoom = currentRoom.East;
			}
			else {
				if (currentRoom.West != null) {continue;}
				currentRoom.West = new Room(false, inProgressRoomID);
				currentRoom.West.East = currentRoom;
				currentRoom.next = currentRoom.West;
				currentRoom = currentRoom.West;
			}

			dungeon[inProgressRoomID] = (Room) currentRoom;
			inProgressRoomID++;
		}
		currentRoom = Room0;
		while (currentRoom != null) {
			currentRoom.populate();
			//currentRoom.roomReport();
			currentRoom = currentRoom.next;
		}
		RoomConnector RC = new RoomConnector();
		RC.roomConnector(dungeon);
	}
}
