package animals;

import animals.exceptions.InsufficientDataException;

/**
 *
 * @author elvis
 */
public class Snake extends Reptile {

    protected boolean hasLegs() {
        return false;
    }

    protected double getWeight() throws InsufficientDataException {
        return 2;
    }
}
