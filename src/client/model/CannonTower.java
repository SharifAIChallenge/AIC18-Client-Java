package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class CannonTower extends Tower {

    static int INITIAL_PRICE;
    static int INITIAL_LEVEL_UP_PRICE;
    static double PRICE_COEFF;
    static int INITIAL_DAMAGE;
    static double DAMAGE_COEFF;
    static int ATTACK_SPEED;
    static int ATTACK_RANGE;
    static int ATTACK_RANGE_SUM;

    public CannonTower(int x, int y, Owner owner, int level, int id) {
        super(x, y, owner, level, id);
    }

    public int getDamage(int level) {
        return (int) (INITIAL_DAMAGE * Math.pow(DAMAGE_COEFF, level - 1));
    }

    public int getDamage(){return this.getDamage(this.getLevel());}

    public int getPrice(int level) {

        if (level == 1)
            return INITIAL_PRICE;
        else
            return (int) (INITIAL_PRICE + INITIAL_LEVEL_UP_PRICE * Math.pow(PRICE_COEFF, level - 1));
    }

    public int getPrice(){
        return this.getPrice(this.getLevel());
    }

    public int getAttackRange(int level) {
        return ATTACK_RANGE + ATTACK_RANGE_SUM * (level - 1);
    }

    public int getAttackRange(){return this.getAttackRange(this.getLevel());}

    public int getAttackSpeed() {
        return ATTACK_SPEED;
    }

    @Override
    public String toString() {
        return "Cannon" + super.toString();
    }
}
