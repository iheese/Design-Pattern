import child.BasicDrink;
import child.CaramelDrink;
import child.WhippedDrink;
import parent.Drink;

public class DecoratorMain {
    public static void main(String[] args) {
        // 휘핑만 조합
        Drink whippedDrink = new WhippedDrink(new BasicDrink());
        whippedDrink.add();

        System.out.println("---다음 음료---");

        // 카라멜 + 휘핑 조합
        Drink caramelWhippedDrink = new CaramelDrink(new WhippedDrink(new BasicDrink()));
        caramelWhippedDrink.add();
    }
}
