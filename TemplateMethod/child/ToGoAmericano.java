package child;

import parent.Coffee;

public class ToGoAmericano extends Coffee {

    @Override
    public void putSomething() {
        System.out.println("물 넣기");
    }

    @Override
    public void wrap() {
        System.out.println("들고 가기 : 일회용잔에 담기");
    }
}
