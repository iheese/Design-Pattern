package painterParent;

import shapeParent.Shape;

public class Painter {
    protected Shape shape;

    public Painter(Shape shape) {
        this.shape = shape;
    }

    public void paint() {
        shape.draw();
    }
}
