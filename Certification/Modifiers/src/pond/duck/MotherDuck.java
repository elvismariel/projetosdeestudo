package pond.duck;

/**
 *
 * @author elvis
 */
public class MotherDuck {

    String noise = "quack";

    void quack() {                      // default access is ok
        System.out.println(noise);
    }

    void makeNoise() {                  // default access is ok
        quack();
    }
}
