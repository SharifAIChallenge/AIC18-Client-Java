package client.model;

/**
 * Created by Parsa on 2/2/2018 AD.
 */
public class StormEvent extends GameEvent {

    public StormEvent(Owner owner, Point location) {
        super(owner, location);
    }

    @Override
    public String toString() {
        return "Storm" + super.toString();
    }
}
