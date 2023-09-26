package child;

import parent.Coffee;

public class ToGoCafeLatte extends Coffee {
    @Override
    public void putSomething() {
        System.out.println("우유 넣기");
    }

    @Override
    public void wrap() {
        System.out.println("들고 가기 : 일회용잔에 담기");
    }
}
