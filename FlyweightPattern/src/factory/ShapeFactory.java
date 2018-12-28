package factory;

import java.util.HashMap;
import shape.Circle;
import shape.Shape;

/**
 *
 * @author elvis
 */
public class ShapeFactory {

    private static final HashMap<String, Shape> circleMap = new HashMap();
    
    public static Shape getCircle(String color){
        Shape circle = (Circle) circleMap.get(color);
        
        if(circle == null){
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color: " + color);
        }
        
        return circle;
    }
}
