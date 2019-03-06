package pond.goose;

import pond.shore.Bird;                 // In a different package

/**
 *
 * @author elvis
 */
public class Gosling extends Bird {     // Extends means create subclass

    public void swim() {
        floatInWater();                 // Calling protected member
        System.out.println(text);       // Calling protected member
    }
}
