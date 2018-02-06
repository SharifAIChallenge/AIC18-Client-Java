package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class GrassCell extends Cell {

    private Tower tower;

    public GrassCell(int x, int y, Tower tower) {
        super(x, y);
        this.tower=tower;
    }

    public boolean isEmpty() {
        if (this.tower == null)
            return true;
        else return false;
    }

    public Tower getTower() {
        return tower;
    }

    @Override
    public String toString() {
        return "g";
    }
}
