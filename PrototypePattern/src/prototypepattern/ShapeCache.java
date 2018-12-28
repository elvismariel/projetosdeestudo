package prototypepattern;

import java.util.Hashtable;
import shape.Circle;
import shape.Rectangle;
import shape.Shape;
import shape.Square;

/**
 *
 * @author elvis
 */
public class ShapeCache {

    private static Hashtable<String, Shape> shapeMap = new Hashtable();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);

        return (Shape) cachedShape.clone();
    }
    
    public static void loadCache(){
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(), circle);
        
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        shapeMap.put(rectangle.getId(), rectangle);
        
        Square square = new Square();
        square.setId("3");
        shapeMap.put(square.getId(), square);
    }
}
