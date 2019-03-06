package pond.duck;

/**
 *
 * @author elvis
 */
public class BadDuckling {
    public void makeNoise(){
        FatherDuck fatherDuck = new FatherDuck();
        fatherDuck.quack();                         // Does Not Compile
        
        System.out.println(fatherDuck.noise);       // Does Not Compile
    }
}
