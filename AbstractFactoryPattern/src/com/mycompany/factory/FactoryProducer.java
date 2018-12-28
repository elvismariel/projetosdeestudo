package com.mycompany.factory;

/**
 *
 * @author elvis
 */
public class FactoryProducer {

    public static AbstractFactory getFactory(String factoryType) {
        if (factoryType == null || factoryType.isEmpty()) {
            return null;
        } else {
            switch (factoryType.toUpperCase()) {
                case "SHAPE":
                    return new ShapeFactory();
                case "COLOR":
                    return new ColorFactory();
                default:
                    return null;
            }
        }
    }
}
