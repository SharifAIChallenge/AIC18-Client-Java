package client.model;

/**
 * Created by Parsa on 1/22/2018 AD.
 */
public class Entity {

    private Point point;
    private Owner owner;
    private int id;

    public Entity(int x, int y, Owner owner, int id) {

        point = new Point(x, y);
        this.owner = owner;
        this.id = id;

    }

    public Point getPoint() {
        return point;
    }

    public Owner getOwner() {
        return owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return " @ x:" + point.getX() + " y:" + point.getY() +
                " Owner: " + owner.toString() + " Id:" + id;
    }
}
