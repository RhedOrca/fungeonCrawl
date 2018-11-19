package fungeonCrawl;

import fungeonCrawl.monsters.Spider;

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
		this.species = "Human";
	}

	public String look() {
		Room currentRoom = (Room) location;
		StringBuilder roomLook = new StringBuilder();
		//currentRoom.roomReport();
		roomLook.append("You are in ");
		roomLook.append(currentRoom.adjective);
		roomLook.append(" ");
		roomLook.append(currentRoom.roomType);
		roomLook.append(".");
		if (!currentRoom.getOccupants().get(0).species.equals("Human")) {
			roomLook.append("\nThere is a " + currentRoom.getOccupants().get(0).species + " nearby.");
		}
		else {
			roomLook.append("\nYou appear to be alone.");
		}
		roomLook.append("\nExits:");
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
		if (currentRoom.Up != null) {
			roomLook.append(" Up");
		}
		if (currentRoom.Down != null) {
			roomLook.append(" Down");
		}
		roomLook.append(".");
		return roomLook.toString();
	}
}
