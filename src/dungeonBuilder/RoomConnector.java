package dungeonBuilder;

import fungeonCrawl.Room;

public class RoomConnector {
    public void roomConnector(Room[] dungeon) {
        for (Room room1 : dungeon) {
            for (Room room2 : dungeon) {
                if (room1 != room2 &&
                        room1.xCoord == room2.xCoord &&
                        room1.yCoord == room2.yCoord &&
                        room1.Up == null &&
                        room1.Down == null &&
                        room2.Up == null &&
                        room2.Down == null)
                {
                    room1.Up = room2;
                    room2.Down = room1;
                    System.out.println("Connection made between rooms " + room1.RoomID + " and " + room2.RoomID);
                }
            }
        }
    }
}

