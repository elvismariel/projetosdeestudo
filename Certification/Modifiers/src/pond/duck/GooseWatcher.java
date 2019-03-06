package pond.duck;

import pond.goose.Goose;

/**
 *
 * @author elvis
 */
public class GooseWatcher {
    public void watch(){
        Goose goose = new Goose();
        goose.floatInWater();           // Does Not Compile
    }
}
