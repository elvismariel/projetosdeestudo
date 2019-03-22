package implementing.interfaces;

/**
 *
 * @author elvis
 */
public class Bear implements Herbivore, Omnivore {

    @Override
    public void eatPlants() {
        System.out.println("Eating plants");
    }

    @Override
    public void eatMeat() {
        System.out.println("Eating meat");
    }
    
}
