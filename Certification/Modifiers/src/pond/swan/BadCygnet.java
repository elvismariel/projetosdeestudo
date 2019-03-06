package pond.swan;

import pond.duck.MotherDuck;

/**
 *
 * @author elvis
 */
public class BadCygnet {

    public void makeNoise() {
        MotherDuck motherDuck = new MotherDuck();   // MotherDuck only allows access for de same package
        motherDuck.quack();                         // Does Not Compile

        System.out.println(motherDuck.noise);       // Does Not Compile
    }
}
