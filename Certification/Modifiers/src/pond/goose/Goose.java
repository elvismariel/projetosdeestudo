package pond.goose;

import pond.shore.Bird;

/**
 *
 * @author elvis
 */
public class Goose extends Bird {

    public void helpGooseSwim() {
        Goose other = new Goose();
        other.helpGooseSwim();
        System.out.println(other.text);
    }

    public void helpOtherGooseSwim() {
        Bird other = new Goose();
        other.floatInWater();               // Does Not Compile
        System.out.println(other.text);     // Does Not Compile
    }
}
