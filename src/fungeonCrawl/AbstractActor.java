package fungeonCrawl;

public abstract class AbstractActor {
	protected String name;
    protected AbstractRoom location;
    protected int maxHp = 20;
    protected int hp = 20;
    protected int dr = 0;
    protected int melDmg = 1;
    protected int melAcc = 90;
    protected int magDmg = 1;
    protected int magAcc = 70;
    protected int rngdDmg = 1;
    protected int rngdAcc = 80;
    protected int melResist = 0;
    protected int rngdResist = 0;
    protected int magResist = 0;


    public void setLocation(Room room) {
        this.location = room;
    }

    public void reportHp() {
    	System.out.println(name + " has " + getHp() + " health remaining.");
    }
    
    public int getMaxHp() {
    	return maxHp;
    }
    
    public void setMaxHp(final int maxHp) {
    	this.maxHp = maxHp;
    }
    
    public int getMelAcc() {
    	return melAcc;
    }
    
    public void setMelAcc(final int melAcc) {
    	this.melAcc = melAcc;
    }
    
    public int getMagAcc() {
    	return magAcc;
    }
    
    public void setMagAcc(final int magAcc) {
    	this.magAcc = magAcc;
    }
    
    public int getRngdAcc() {
    	return rngdAcc;
    }
    
    public void setRngdAcc(final int rngdAcc) {
    	this.rngdAcc = rngdAcc;
    }
    
    public int getRngdResist() {
    	return rngdResist;
    }
    
    public void setRngdResist(final int rngdResist) {
    	this.rngdResist = rngdResist;
    }
    
    public int getMagResist() {
    	return magResist;
    }
    
    public void setMagResist(final int magResist) {
    	this.magResist = magResist;
    }

    public String getName() {
        return name;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public int getMelDmg() {
        return melDmg;
    }

    public void setMelDmg(final int dmg) {
        this.melDmg = dmg;
    }

    public int getMagDmg() {
        return magDmg;
    }

    public void setMagDmg(final int dmg) {
        this.magDmg = dmg;
    }

    public int getRngdDmg() {
        return rngdDmg;
    }

    public void setRngdDmg(final int dmg) {
        this.rngdDmg = dmg;
    }

    public int getDR() {
      return dr;
    }

    public void setDR(final int dr) {
      this.dr = dr;
    }

    public void resetDR() {
      this.dr = 0;
    }
    
    public int getMelResist() {
    	return melResist;
    }
    
    public void setMelResist(final int melResist) {
    	this.melResist = melResist;
    }
    

}
