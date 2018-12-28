package interfaces;

import packing.Bottle;

/**
 *
 * @author elvis
 */
public abstract class ColdDrink implements Item {

    @Override
    public Packing packing() {
        return new Bottle();
    }
}
