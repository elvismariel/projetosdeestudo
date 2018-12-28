package shape;

/**
 *
 * @author elvis
 */
public class Rectangle extends Shape {

    public Rectangle() {
        type = "Rectangle";
    }

    @Override
    void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
