package dungeonBuilder;

import fungeonCrawl.Room;

public class RoomConnector {
    public void roomConnector(Room[] dungeon) {
        int next=1;
        for (Room room: dungeon) {
            int northOrSouth = 0;
            int eastOrWest = 0;
            for (int i=next; i < dungeon.length-2; i++) {
                if (dungeon[i] == room.North) { //if the next room in dungeon array is the room to the north...
                    northOrSouth++; //NOS ++
                    if (northOrSouth == 0 && eastOrWest == 0) {
                        System.out.println("Connection made on pass " + i);
                        dungeon[i].North = room;
                    }
                } else if (dungeon[i] == room.South) {//if the next room is the room to the south...
                    northOrSouth--; //NOS --
                    if (northOrSouth == 0 && eastOrWest == 0) {
                        System.out.println("Connection made on pass " + i);
                        dungeon[next].South = room;

                    }
                } else if (dungeon[i] == room.East) {//if the next room is the room to the east...
                    eastOrWest++;
                    if (northOrSouth == 0 && eastOrWest == 0) {
                        System.out.println("Connection made on pass " + i);
                        dungeon[i].East = room;

                    }
                } else {//if the next room is the room to the west...
                    eastOrWest--;
                    if (northOrSouth == 0 && eastOrWest == 0) {
                        System.out.println("Connection made on pass " + i);
                        dungeon[i].West = room;
                    }
                }
            }
            next++;
        }
    }
}

