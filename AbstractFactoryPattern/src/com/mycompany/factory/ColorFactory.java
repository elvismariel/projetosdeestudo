package com.mycompany.factory;

import com.mycompany.color.Blue;
import com.mycompany.color.Color;
import com.mycompany.color.Green;
import com.mycompany.color.Red;
import com.mycompany.shape.Shape;

/**
 *
 * @author elvis
 */
public class ColorFactory extends AbstractFactory {

    @Override
    public Color getColor(String colorType) {
        if (colorType == null || colorType.isEmpty()) {
            return null;
        } else {
            switch (colorType.toUpperCase()) {
                case "RED":
                    return new Red();
                case "BLUE":
                    return new Blue();
                case "GREEN":
                    return new Green();
                default:
                    return null;
            }
        }
    }

    @Override
    public Shape getShape(String shapeType) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
