package client.model;

/**
 * Created by Parsa on 2/2/2018 AD.
 */
public class BeanEvent extends GameEvent {

    public BeanEvent(Owner owner, Point location) {
        super(owner, location);
    }

    @Override
    public String toString() {
        return "Bean" + super.toString();
    }
}
