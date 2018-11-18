package dungeonBuilder;


import fungeonCrawl.AbstractRoom;
import fungeonCrawl.Player;
import fungeonCrawl.Room;
import java.util.*;
import java.util.ArrayList;

public class DungeonBuilder {
	Room Room0 = new Room(false, 0);
	public void buildDungeon(int dungeonLength, Player player) {
		Room[] dungeon = new Room[dungeonLength];
		dungeon[0] = Room0;
		Random rand = new Random();
		player.setLocation(Room0);
		int inProgressRoomID = 1;
		AbstractRoom currentRoom = Room0;
		int inProgressX=0;
		int inProgressY=0;
		while (inProgressRoomID < dungeonLength) {
			int buildDirection = rand.nextInt(4);
			if (buildDirection == 0) {
				if (currentRoom.North != null) {continue;}
				currentRoom.North = new Room(false, inProgressRoomID);
				inProgressY++;
				currentRoom.North.South = currentRoom;
				currentRoom.next = currentRoom.North;
				currentRoom = currentRoom.North;
				currentRoom.yCoord = inProgressY;
				currentRoom.xCoord = inProgressX;

			}
			else if (buildDirection == 1) {
				if (currentRoom.South != null) {continue;}
				currentRoom.South = new Room(false, inProgressRoomID);
				inProgressY--;
				currentRoom.South.North = currentRoom;
				currentRoom.next = currentRoom.South;
				currentRoom = currentRoom.South;
				currentRoom.yCoord = inProgressY;
				currentRoom.xCoord = inProgressX;

			}
			else if (buildDirection == 2) {
				if (currentRoom.East != null) {continue;}
				currentRoom.East = new Room(false, inProgressRoomID);
				inProgressX++;
				currentRoom.East.West = currentRoom;
				currentRoom.next = currentRoom.East;
				currentRoom = currentRoom.East;
				currentRoom.yCoord = inProgressY;
				currentRoom.xCoord = inProgressX;
			}
			else {
				if (currentRoom.West != null) {continue;}
				currentRoom.West = new Room(false, inProgressRoomID);
				inProgressX--;
				currentRoom.West.East = currentRoom;
				currentRoom.next = currentRoom.West;
				currentRoom = currentRoom.West;
				currentRoom.yCoord = inProgressY;
				currentRoom.xCoord = inProgressX;
			}

			dungeon[inProgressRoomID] = (Room) currentRoom;
			inProgressRoomID++;
		}

		RoomConnector RC = new RoomConnector();
		RC.roomConnector(dungeon);
	}
}
