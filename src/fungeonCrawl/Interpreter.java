package fungeonCrawl;
import fungeonCrawl.AbstractRoom;
import fungeonCrawl.Room;
import fungeonCrawl.Move;

import java.util.Arrays;

public class Interpreter {
    public static void interpret(String choice, Player player){
        String[] input = choice.split(" ");
        //System.out.println(Arrays.toString(input));
        if (input[0].toLowerCase().equals("look") || input[0].toLowerCase().equals("l")) {
            System.out.println(player.look());
        }
        else if (input[0].equals("move") || input[0].equals("go")) {
            Move.moveRooms(player, player.location, input[1]);
            System.out.println(player.look());
        }
    }
}
