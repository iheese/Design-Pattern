package child;

import parent.Coffee;

public class Americano extends Coffee {

    @Override
    public void putSomething() {
        System.out.println("물 넣기");
    }
}
