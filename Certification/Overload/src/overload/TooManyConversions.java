package overload;

/**
 *
 * @author elvis
 */
public class TooManyConversions {
    public static void play(Long l){
        
    }
    
    public static void play(Long... l){
        
    }
    
    public static void main(String[] args) {
        play(4);                                // Does Not Compile, more narrower
        play(4L);                               // Calls the Log version
    }
}
