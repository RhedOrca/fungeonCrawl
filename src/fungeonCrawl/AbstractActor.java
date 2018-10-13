package fungeonCrawl;

public abstract class AbstractActor {
	private String name; //
    private int maxHp = 20;
    private int hp = 20; //
    private boolean isAlive = true; //
    private int dr = 0; //
    private int melDmg = 1; //
    private int melAcc = 90; //
    private int magDmg = 1; //
    private int magAcc = 70; //
    private int rngdDmg = 1; //
    private int rngdAcc = 80; //
    private int melResist = 0; //
    private int rngdResist = 0; //
    private int magResist = 0; //


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
    
    public boolean getIsAlive() {
        return isAlive;
    }

    public void setIsAlive(final boolean isAlive) {
        this.isAlive = isAlive;
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

    public void setHp(final int hp) {
        this.hp = hp;

        if (this.hp <= 0) {
            this.isAlive = false;
        }
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
}
