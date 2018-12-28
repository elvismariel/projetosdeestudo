package burger;

import interfaces.Item;
import interfaces.Packing;
import packing.Wrapper;

/**
 *
 * @author elvis
 */
public abstract class Burger implements Item {

    @Override
    public Packing packing() {
        return new Wrapper();
    }
}
