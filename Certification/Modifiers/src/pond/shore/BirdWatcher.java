package pond.shore;             // Same package as Bird

/**
 *
 * @author elvis
 */
public class BirdWatcher {

    public void watchBird() {
        Bird bird = new Bird();
        bird.floatInWater();                // Calling protected member
        
        System.out.println(bird.text);      // Calling protected member
    }
}
