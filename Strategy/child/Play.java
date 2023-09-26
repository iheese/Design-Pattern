package child;

import parent.Strategy;

public class Play implements Strategy {

    @Override
    public void solveProblem() {
        System.out.println("놀기 전략으로 스트레스 풀기");
    }
}
