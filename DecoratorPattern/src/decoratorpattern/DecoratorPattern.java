package decoratorpattern;

import shape.Circle;
import shape.Rectangle;
import shape.RedShapeDecorator;
import shape.Shape;

/**
 *
 * @author elvis
 */
public class DecoratorPattern {

    public static void main(String[] args) {
        System.out.println("Circle with normal border");
        Shape circle = new Circle();
        circle.draw();
        
        System.out.println("\nCircle of red border");
        Shape redCircle = new RedShapeDecorator(new Circle());
        redCircle.draw();
        
        System.out.println("\nRectagle of red border");
        Shape redRectangle = new RedShapeDecorator(new Rectangle());
        redRectangle.draw();
    }
}
