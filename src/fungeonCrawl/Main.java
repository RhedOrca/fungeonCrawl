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

		int dungeonLength = Integer.parseInt(input);

		Player player1 = new Player("Eric", "Brawler");
		Goblin Gubthrub = new Goblin("Gubthrub");

		DungeonBuilder dungeonBuilder = new DungeonBuilder();
		dungeonBuilder.buildDungeon(dungeonLength, player1);



		player1.intro();


		while (player1.getIsAlive()) {
			System.out.println("What would you like to do?" + " You can: Look (L), Go (G), etc...");
			String choice = scanner.nextLine();
			Interpreter.interpret(choice, player1);

		}
	}
}
