package child;

import parent.Coffee;

public class CafeLatte extends Coffee {
    @Override
    public void putSomething() {
        System.out.println("우유 넣기");
    }
}
