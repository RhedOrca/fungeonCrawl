package fungeonCrawl;

import fungeonCrawl.monsters.*;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;

public abstract class AbstractRoom {
    public AbstractRoom North;
    public AbstractRoom South;
    public AbstractRoom East;
    public AbstractRoom West;
    public AbstractRoom next;
    public AbstractRoom Up;
    public AbstractRoom Down;

    public int RoomID;
    public int yCoord = 0;
    public int xCoord = 0;
    public boolean cleared = false;
    public ArrayList<AbstractActor> occupants = new ArrayList<AbstractActor>();
    public ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    public void populate() { //adds NPC's and treasure to the room
        Random rand = new Random();
        int monsterID = rand.nextInt(20) + 1;
        int treasureID = rand.nextInt(20) + 1;
        if (monsterID < 7) {
            setCleared(true);
        } else if (monsterID < 15) {
            occupants.add(new Goblin("Goblin"));
        } else {
            occupants.add(new Spider("Spider"));
        }
        this.treasures.add(new Treasure(treasureID));
    }


    public boolean getCleared() {
        return cleared;
    }

    public void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    public List<AbstractActor> getOccupants() {
        return occupants;
    }

    public void setOccupant(ArrayList<AbstractActor> occupants) {
        this.occupants = occupants;
    }

    public List<Treasure> getTreasure() {
        return treasures;
    }

    public void setTreasure(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void occupantUpdate() {
        for (AbstractActor occupant : occupants) {
            if (occupant.getHp() < 1) {
                occupants.remove(occupant);
            }
        }
    }
}
