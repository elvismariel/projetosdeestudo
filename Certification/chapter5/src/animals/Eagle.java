package animals;

/**
 *
 * @author elvis
 */
public class Eagle extends Bird {

    public int fly(int height) {
        System.out.println("Bird is flying at " + height + " meters");
        return height;
    }

    public int eat(int food) {   // Does Not Compile
        System.out.println("Bird is eating " + food + " units of food");
        return food;
    }
}
