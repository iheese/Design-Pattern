package shapeChild;

import shapeParent.Shape;

public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println("원");
    }
}
