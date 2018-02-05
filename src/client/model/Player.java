package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Player {

    private int money;
    private int income;
    private int strength;
    private int beansLeft;
    private int stormsLeft;

    public Player(int money, int income, int strength, int beansLeft, int stormsLeft) {

        this.money = money;
        this.income = income;
        this.strength = strength;
        this.beansLeft = beansLeft;
        this.stormsLeft = stormsLeft;
    }

    public int getIncome() {
        return income;
    }

    public int getMoney() {
        return money;
    }

    public int getStrength() {
        return strength;
    }

    public int getBeansLeft() {
        return beansLeft;
    }

    public int getStormsLeft() {
        return stormsLeft;
    }

    @Override
    public String toString() {
        return "Player:: " + "money:" + money + " income:" + income +
                " strength:" + strength + " beansLeft:" + beansLeft +
                " stormsLeft:" + stormsLeft;
    }
}
