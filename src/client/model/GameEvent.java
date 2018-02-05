package client.model;

import java.awt.*;

/**
 * Created by Parsa on 2/2/2018 AD.
 */
public class GameEvent {

    private Owner owner;
    private Point point;

    public GameEvent(Owner owner, Point point) {
        this.owner = owner;
        this.point = point;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Point getPoint() {
        return point;
    }

    @Override
    public String toString() {
        return " Event @ x:" + point.getX() + " y:" + point.getY() + " Owner:" + owner;
    }
}
