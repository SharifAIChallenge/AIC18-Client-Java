package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Cell {

    private Point point;

    public Cell(int x, int y) {
        point = new Point(x, y);

    }
    public Point getPoint() {
        return point;
    }

}
