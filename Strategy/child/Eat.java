package child;

import parent.Strategy;

public class Eat implements Strategy {
    @Override
    public void solveStress() {
        System.out.println("먹기 전략으로 스트레스 풀기");
    }
}
