package child;

import parent.Strategy;

public class Sleep implements Strategy {

    @Override
    public void solveProblem() {
        System.out.println("자기 전략으로 스트레스 풀기");
    }
}
