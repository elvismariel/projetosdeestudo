package com.mycompany.factory;

import com.mycompany.color.Color;
import com.mycompany.shape.Circle;
import com.mycompany.shape.Rectangle;
import com.mycompany.shape.Shape;
import com.mycompany.shape.Square;

/**
 *
 * @author elvis
 */
public class ShapeFactory extends AbstractFactory {

    @Override
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

    @Override
    public Color getColor(String colorType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
