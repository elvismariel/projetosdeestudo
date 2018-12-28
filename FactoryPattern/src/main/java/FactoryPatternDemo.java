
import com.mycompany.factory.ShapeFactory;
import com.mycompany.shape.Shape;

/**
 *
 * @author elvis
 */
public class FactoryPatternDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ShapeFactory shapeFactory = new ShapeFactory();

        Shape shapeCircle = shapeFactory.getShape("Circle");
        shapeCircle.draw();

        Shape shapeSquare = shapeFactory.getShape("Square");
        shapeSquare.draw();

        Shape shapeRectagle = shapeFactory.getShape("RECTANGLE");
        shapeRectagle.draw();
    }
}
