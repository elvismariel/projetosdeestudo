package abstractfactorypattern;

import com.mycompany.color.Color;
import com.mycompany.factory.AbstractFactory;
import com.mycompany.factory.FactoryProducer;
import com.mycompany.shape.Shape;

/**
 *
 * @author elvis
 */
public class AbstractFactoryPattern {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        AbstractFactory shapeFactory = FactoryProducer.getFactory("SHAPE");
        
        Shape circle = shapeFactory.getShape("CIRCLE");
        circle.draw();

        Shape rectagle = shapeFactory.getShape("Rectangle");
        rectagle.draw();

        Shape square = shapeFactory.getShape("Square");
        square.draw();

        
        AbstractFactory colorFactory = FactoryProducer.getFactory("COLOR");
        
        Color blue = colorFactory.getColor("Blue");
        blue.fill();
        
        Color red = colorFactory.getColor("Red");
        red.fill();
        
        Color green = colorFactory.getColor("Green");
        green.fill();
    }
}
