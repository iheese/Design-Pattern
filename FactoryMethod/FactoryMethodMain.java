import factory.ItemFactory;
import framework.Item;

public class FactoryMethodMain {
    public static void main(String[] args) {
        ItemFactory factory = new ItemFactory();

        Item bananaItem = factory.makeItem("바나나");
        Item boasterItem = factory.makeItem("부스터");

        bananaItem.use();
        boasterItem.use();
    }
}
