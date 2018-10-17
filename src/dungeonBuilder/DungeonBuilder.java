package dungeonBuilder;
import java.util.List;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;
import fungeonCrawl.Room;
import java.util.Random;

public class DungeonBuilder {
	public static void buildDungeon(int dungeonLength) {
		ArrayList<Room> dungeon = new ArrayList<Room>();
		int inProgressRoom = 0;
		while (inProgressRoom < dungeonLength) {
			dungeon.add(new Room(false, inProgressRoom));
			inProgressRoom++;
		}
		for (Room room : dungeon) {
			room.populate();
			room.roomReport();
		}
	}
}
