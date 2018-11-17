package fungeonCrawl;
import fungeonCrawl.monsters.*;
import dungeonBuilder.DungeonBuilder;
import java.util.Scanner;

import static fungeonCrawl.Move.moveRooms;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please enter your dungeon length. (Int only!)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		int dungeonLength = Integer.parseInt(input);
		DungeonBuilder.buildDungeon(dungeonLength);
		AbstractRoom Room0 = new Room(false, 0);
		Player Eric = new Player("Eric", "Brawler", Room0);
		//Goblin Gubthrub = new Goblin("Gubthrub", Room0);
		Eric.intro();
		while (Eric.getIsAlive()) {
			System.out.println("Where would you like to go?");
			//Scanner scanner = new Scanner(System.in);
			moveRooms(Eric, Room0.next, "North");
		}
	}
}
