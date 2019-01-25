package observer;

/**
 *
 * @author elvis
 */
public abstract class Observer {
    
    protected Subject subject;
    
    public abstract void update();
}
