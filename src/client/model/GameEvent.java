package client.model;

import java.awt.*;

/**
 * Created by Parsa on 2/2/2018 AD.
 */
public class GameEvent {

    private Owner owner;
    private Point location;

    public GameEvent(Owner owner, Point location) {
        this.owner = owner;
        this.location = location;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public Point getPoint() {
        return location;
    }

    @Override
    public String toString() {
        return " Event @ x:" + location.getX() + " y:" + location.getY() + " Owner:" + owner;
    }
}
