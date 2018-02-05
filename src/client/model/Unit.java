package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Unit extends Entity {

    private int health;
    private int level;

    private Path path;

    public Unit(int x, int y, Owner owner, int level,int id) {
        super(x, y, owner,id);
        this.level=level;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getMoveSpeed() {
        return 0;
    }

    public int getPrice(int level) {
        return 0;
    }

    public int getPrice(){return 0;}

    public int getBounty(int level) {
        return 0;
    }

    public int getBount(){return 0;}

    public int getDamage() {
        return 0;
    }

    public int getVisionRange() {
        return 0;
    }

    public int getLevel() {
        return this.level;
    }

    public Path getPath(){
        return this.path;
    }

    public int getIncome(){
        return 0;
    }

    public void setPath(Path path) {
        this.path = path;
    }


    @Override
    public String toString() {
        return "Unit:: "+"health:"+health+" price:"+getPrice(this.level)+" damage:"+getDamage()
                +" moveSpeed:"+ getMoveSpeed()+" visionRange:"+ getVisionRange()
                +" Income:"+getIncome()+" bounty:"+getBounty(this.level)+super.toString();
    }
}
