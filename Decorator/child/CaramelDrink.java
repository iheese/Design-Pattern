package child;

import parent.Drink;

public class CaramelDrink extends DrinkDecorator{
    public CaramelDrink(Drink drink) {
        super(drink);
    }

    @Override
    public void add() {
        super.add();
        System.out.println("카라멜 드리즐 추가");
    }
}
