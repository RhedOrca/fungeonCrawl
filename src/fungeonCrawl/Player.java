package fungeonCrawl;

public class Player extends AbstractActor{
	private String unitClass;
	boolean isAlive = true;
	boolean getIsAlive(){
		return isAlive;
	}
	public void intro(){
		System.out.println("Hi, my name is " + getName() + ".");
	}
	Player(String name, String unitClass) {
		setName(name);
		this.unitClass = unitClass;
	}

	public String look() {
		AbstractRoom currentRoom = location;
		StringBuilder roomLook = new StringBuilder();
		roomLook.append("You are in a ");
		roomLook.append(currentRoom.adjective);
		roomLook.append(" ");
		roomLook.append(currentRoom.roomType);
		roomLook.append(". You can see a path leading to the");
		if (currentRoom.North != null) {
			roomLook.append(" North");
		}
		if (currentRoom.South != null) {
			roomLook.append((" South"));
		}
		if (currentRoom.East != null) {
			roomLook.append(" East");
		}
		if (currentRoom.West!= null) {
			roomLook.append(" West");
		}
		roomLook.append(".");
		currentRoom.roomReport();

		return roomLook.toString();
	}
}
