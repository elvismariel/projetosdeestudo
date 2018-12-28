package packing;

import interfaces.Packing;

/**
 *
 * @author elvis
 */
public class Bottle implements Packing {

    @Override
    public String pack() {
        return "Bottle";
    }
}
