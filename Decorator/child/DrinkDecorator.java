package child;

import parent.Drink;

public class DrinkDecorator implements Drink {
    protected Drink drink;

    public DrinkDecorator(Drink drink) {
        this.drink = drink;
    }
    @Override
    public void add() {
        this.drink.add();
    }
}
