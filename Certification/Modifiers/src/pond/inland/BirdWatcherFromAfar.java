package pond.inland;

import pond.shore.Bird;                 // Different package tha Bird

/**
 *
 * @author elvis
 */
public class BirdWatcherFromAfar {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();            // Does Not Compile
        
        System.out.println(bird.text);  // Does Not Compile
    }
}
