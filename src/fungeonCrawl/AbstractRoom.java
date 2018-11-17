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

    public int RoomID;
    public boolean cleared = false;
    public ArrayList<AbstractActor> occupants = new ArrayList<AbstractActor>();
    public ArrayList<Treasure> treasures = new ArrayList<Treasure>();

    public void populate() {
        Random rand = new Random();
        int monsterID = rand.nextInt(20) + 1;
        int treasureID = rand.nextInt(20) + 1;
        if (monsterID < 7) {
            setCleared(true);
        }
        else if (monsterID < 15) {
            occupants.add(new Goblin("Goblin"));
        }
        else {
            occupants.add(new Spider("Spider"));
        }
        this.treasures.add(new Treasure(treasureID));
    }

    public void roomReport() {
        System.out.println("Room" + RoomID + " exists.");
        System.out.println(getOccupants());
        System.out.println(getTreasure());
    }
    private boolean getCleared() {
        return cleared;
    }

    private void setCleared(boolean cleared) {
        this.cleared = cleared;
    }

    private List<AbstractActor> getOccupants() {
        return occupants;
    }

    private void setOccupant(ArrayList<AbstractActor> occupants) {
        this.occupants = occupants;
    }

    private List<Treasure> getTreasure() {
        return treasures;
    }

    private void setTreasure(ArrayList<Treasure> treasures) {
        this.treasures = treasures;
    }

    public void occupantUpdate() {
        for (AbstractActor occupant : occupants){
            if (!occupant.getIsAlive()) {
                occupants.remove(occupant);
            }
        }
    }
}
