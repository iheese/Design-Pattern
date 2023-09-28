package child;

import parent.Drink;

public class BasicDrink implements Drink {
    @Override
    public void add() {
        System.out.println("기본 음료");
    }
}
