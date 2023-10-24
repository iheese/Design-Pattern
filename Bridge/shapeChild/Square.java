package shapeChild;

import shapeParent.Shape;

public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println("사각형");
    }
}
