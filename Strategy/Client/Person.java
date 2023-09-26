package Client;

import parent.Strategy;

public class Person {
    public void getStress(Strategy strategy) {
        System.out.println("---스트레스를 받음---");
        strategy.solveProblem();
        System.out.println("---스트레스 해소---");
    }
}
