package shape;

import draw.DrawAPI;

/**
 *
 * @author elvis
 */
public abstract class Shape {

    protected DrawAPI drawApi;

    protected Shape(DrawAPI drawApi) {
        this.drawApi = drawApi;
    }

    public abstract void draw();
}
