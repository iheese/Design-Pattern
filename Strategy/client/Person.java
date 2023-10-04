package client;

import parent.Strategy;

public class Person {
    public void getStress(Strategy strategy) {
        System.out.println("---스트레스를 받음---");
        strategy.solveStress();
        System.out.println("---스트레스 해소---");
    }
}
