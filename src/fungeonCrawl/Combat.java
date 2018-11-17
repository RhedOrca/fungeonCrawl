package fungeonCrawl;

public class Combat {
    public static void combatDemo(AbstractActor Eric, AbstractActor Gubthrub) {

        Eric.reportHp();
		Eric.spark(Gubthrub);
		Eric.reportHp();
		int turn = 0;
		while(Gubthrub.getIsAlive() && Eric.getIsAlive()) {
			switch(turn % 4) {
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
