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
                    room1.Up = room2;  //Puts room 2 above room 1 and allows travel between them
                    room2.Down = room1;
                    if (room1.North == null) {  //if Room1 or Room2 have empty exits, pulls exits from the other room and matches them
                        room1.North = room2.North;
                    }
                    if (room1.South == null) {
                        room1.South = room2.South;
                    }
                    if (room1.East == null) {
                        room1.East = room2.East;
                    }
                    if (room1.West == null) {
                        room1.West = room2.West;
                    }

                    if (room2.North == null) {
                        room2.North = room1.North;
                    }
                    if (room2.South == null) {
                        room2.South = room1.South;
                    }
                    if (room2.East == null) {
                        room2.East = room1.East;
                    }
                    if (room2.West == null) {
                        room2.West = room1.West;
                    }
                    //System.out.println("Connection made between rooms " + room1.RoomID + " and " + room2.RoomID);
                }
                room1.connections = 0; //keeps track of how many exits a room has
                if (room1.North != null) {
                    room1.connections++;
                }
                if (room1.South != null) {
                    room1.connections++;
                }
                if (room1.East != null) {
                    room1.connections++;
                }
                if (room1.West != null) {
                    room1.connections++;
                }
                if (room1.Up != null) {
                    room1.connections++;
                }
                if (room1.Down != null) {
                    room1.connections++;
                }

            }
        }
    }
}

