package pond.duck;

/**
 *
 * @author elvis
 */
public class GoodDuckling {

    public void makeNoise() {
        MotherDuck motherDuck = new MotherDuck();
        motherDuck.quack();                         // default access

        System.out.println(motherDuck.noise);       // default access
    }
}
