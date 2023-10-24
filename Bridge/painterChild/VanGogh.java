package painterChild;

import painterParent.Painter;
import shapeParent.Shape;

public class VanGogh extends Painter {
    public VanGogh(Shape shape) {
        super(shape);
    }

    @Override
    public void paint() {
        System.out.print("반 고흐가 그린 것 : ");
        shape.draw();
    }
}
