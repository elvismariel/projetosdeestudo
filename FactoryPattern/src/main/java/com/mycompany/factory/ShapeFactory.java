package com.mycompany.factory;

import com.mycompany.shape.Circle;
import com.mycompany.shape.Rectangle;
import com.mycompany.shape.Shape;
import com.mycompany.shape.Square;

/**
 *
 * @author elvis
 */
public class ShapeFactory {

    public Shape getShape(String shapeType) {
        if (shapeType == null || shapeType.isEmpty()) {
            return null;
        } else {
            switch (shapeType.toUpperCase()) {
                case "CIRCLE":
                    return new Circle();
                case "RECTANGLE":
                    return new Rectangle();
                case "SQUARE":
                    return new Square();
                default:
                    return null;
            }
        }
    }
}
