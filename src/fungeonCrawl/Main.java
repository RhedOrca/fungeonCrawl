package fungeonCrawl;
import fungeonCrawl.monsters.*;
import dungeonBuilder.DungeonBuilder;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		System.out.println("Please enter your dungeon length. (Int only!)");
		Scanner scanner = new Scanner(System.in);
		String input = scanner.nextLine();
		scanner.close();
		int dungeonLength = Integer.parseInt(input);
		DungeonBuilder.buildDungeon(dungeonLength);
		Player Eric = new Player("Eric", "Brawler");
		Goblin Gubthrub = new Goblin("Gubthrub");
		
		/*Eric.intro();
		Eric.spark(Gubthrub);
		Eric.reportHp();
		int turn = 0;
		while(Gubthrub.getIsAlive() && Eric.getIsAlive()) {
			switch(turn % 3) {
			case 0:
				Gubthrub.spark(Eric);
				break;
			case 1:
				Gubthrub.slash(Eric);
				break;
			case 2:
				Gubthrub.defend();
				break;
			case 3:
				Gubthrub.shoot(Eric);
				break;
			}
			Eric.spark(Gubthrub);
			Eric.resetDR();
			Gubthrub.resetDR();
			turn++;
			
		}*/
	}
}
