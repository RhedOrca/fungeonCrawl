package fungeonCrawl;

public class Combat {
    public static void combatDemo(AbstractActor Eric, AbstractActor Gubthrub) {
/*
		public void slash(final AbstractActor target) {
			if ((getMelDmg() - target.getMelResist()) - target.getDR() > 0) {
				target.setHp(target.getHp() - (getMelDmg() - target.getMelResist() - target.getDR()));
				System.out.println(getName() + "'s Slash did " + getMelDmg() + " damage!");
			}
			else {
				System.out.println(this.name + "'s attack did no damage!");
			}
			target.reportHp();
			System.out.println();
		}

		public void spark(final AbstractActor target) {
			double hitchance = Math.floor(Math.random() * 100);
			if (hitchance <= getMagAcc()) { //magic accuracy is out of 100
				target.setHp(target.getHp() - getMagDmg());
				System.out.println(getName() + "'s spark did " + getMagDmg() + " damage!");
			}
			else{
				System.out.println(getName() + "'s Spark missed!");
			}
			target.reportHp();
			System.out.println();
		}

		public void defend() { //heal for 1, gain 2 DR.
			if ((getHp() + 1) <= this.maxHp) {
				setHp(getHp() + 1);
			}
			else{
				setHp(maxHp);
			}
			System.out.println(getName() + " hunkers down!");
			setDR(2);
			reportHp();
			System.out.println();
		}

		public void shoot(final AbstractActor target) {
			//have a % chance to deal attacker's ranged damage
			double hitchance = Math.floor(Math.random() * 100);
			if (hitchance >= getRngdAcc() &&
					(getRngdDmg() - target.getRngdResist() - target.getDR() > 0)) {
				target.setHp(target.getHp() - getRngdDmg());
			}
			else {
				System.out.println(getName() + "'s shot missed!");
			}
			target.reportHp();
			System.out.println();
		}

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

		}*/
    }
}
