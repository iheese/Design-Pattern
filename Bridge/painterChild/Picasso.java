package painterChild;

import painterParent.Painter;
import shapeParent.Shape;

public class Picasso extends Painter {
    public Picasso(Shape shape) {
        super(shape);
    }

    @Override
    public void paint() {
        System.out.print("피카소의 그린 것 : ");
        shape.draw();
    }
}
