import painterChild.Picasso;
import painterChild.VanGogh;
import painterParent.Painter;
import shapeChild.Circle;
import shapeChild.Square;

public class BridgeMain {
    public static void main(String[] args) {
        Painter picasso = new Picasso(new Circle());
        Painter vanGogh = new VanGogh(new Square());

        picasso.paint();
        System.out.println("----------");
        vanGogh.paint();
    }
}