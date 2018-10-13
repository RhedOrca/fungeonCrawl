package fungeonCrawl;

public class Player extends AbstractActor{
	private String unitClass;
	public void intro() {
		System.out.println("Hi, my name is " + getName());
	}
	Player(String name, String unitClass) {
		setName(name);
		this.unitClass = unitClass;
	}
}
