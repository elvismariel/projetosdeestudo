package com.mycompany.factory;

import com.mycompany.color.Color;
import com.mycompany.shape.Shape;

/**
 *
 * @author elvis
 */
public abstract class AbstractFactory {

    public abstract Shape getShape(String shapeType);

    public abstract Color getColor(String colorType);
}
