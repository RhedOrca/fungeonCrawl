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
                character.location = currentRoom.North;
                return true;
            }
        }
        else if (targetDirection.equals("south") || targetDirection.equals("s")) {
            if (currentRoom.South == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.South.occupants.add(character);
                character.location = currentRoom.South;
                return true;
            }
        }
        else if(targetDirection.equals("east") || targetDirection.equals("e")) {
            if (currentRoom.East == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.East.occupants.add(character);
                character.location = currentRoom.East;
                return true;
            }
        }

        else if(targetDirection.equals("west") || targetDirection.equals("w")){
            if (currentRoom.West == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.West.occupants.add(character);
                character.location = currentRoom.West;
                return true;
            }
        }

        else if(targetDirection.equals("next") || targetDirection.equals("x")){
            if (currentRoom.next == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.next.occupants.add(character);
                character.location = currentRoom.next;
                return true;
            }
        }

        else if(targetDirection.equals("up") || targetDirection.equals("u")){
            if (currentRoom.Up == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.Up.occupants.add(character);
                character.location = currentRoom.Up;
                return true;
            }
        }

        else if(targetDirection.equals("down") || targetDirection.equals("d")){
            if (currentRoom.Down == null) return false;

            else {
                currentRoom.occupants.remove(character);
                currentRoom.Down.occupants.add(character);
                character.location = currentRoom.Down;
                return true;
            }
        }

        else {
            return false;
        }
    }
}
