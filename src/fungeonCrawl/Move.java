package fungeonCrawl;

import java.util.ArrayList;

public class Move {
    public static boolean moveRooms(AbstractActor character, AbstractRoom currentRoom, String direction){
        String targetDirection = direction.toLowerCase();
        if (targetDirection.equals("north") || targetDirection.equals("n")) {
            if (currentRoom.North == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.North.occupants.add(character);
                return true;
            }
        }
        else if (targetDirection.equals("south") || targetDirection.equals("s")) {
            if (currentRoom.South == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.North.occupants.add(character);
                return true;
            }
        }
        else if(targetDirection.equals("east") || targetDirection.equals("e")) {
            if (currentRoom.East == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.North.occupants.add(character);
                return true;
            }
        }

        else if(targetDirection.equals("west") || targetDirection.equals("w")){
            if (currentRoom.West == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.North.occupants.add(character);
                return true;
            }
        }

        else {
            return false;
        }
    }
}
