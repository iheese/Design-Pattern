package child;

import parent.Strategy;

public class Sleep implements Strategy {

    @Override
    public void solveStress() {
        System.out.println("자기 전략으로 스트레스 풀기");
    }
}
