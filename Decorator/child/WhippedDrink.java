package child;

import parent.Drink;

public class WhippedDrink extends DrinkDecorator{
    public WhippedDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void add() {
        super.add();
        System.out.println("휘핑 그림 추가");
    }
}
