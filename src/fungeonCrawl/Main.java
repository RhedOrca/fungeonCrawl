package fungeonCrawl;
import fungeonCrawl.monsters.*;

public class Main {
	public static void main(String[] args) {
		Player Eric = new Player("Eric", "Brawler");
		Goblin Gubthrub = new Goblin("Gubthrub");
		Room room1 = new Room(false, null , null);
		Eric.intro();
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
			
		}
	}
}
