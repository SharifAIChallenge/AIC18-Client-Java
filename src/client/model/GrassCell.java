package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class GrassCell extends Cell {

    private Tower tower;

    public GrassCell(int x, int y) {
        super(x, y);
    }

    public boolean isEmpty() {
        if (this.tower == null)
            return true;
        else return false;
    }

    public Tower getTower() {
        return tower;
    }

    public void setTower(Tower tower) {
        this.tower = tower;
    }

    @Override
    public String toString() {
        return "g";
    }
}
