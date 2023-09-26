package parent;

public abstract class Coffee {
    // 템플릿 메소드
    public void makeCoffee() {
        System.out.println("커피 만들기 시작");
        espresso();
        putSomething();
        wrap();
    }

    // 공통 메소드는 상위 클래스에서 구현
    private void espresso() {
        System.out.println("에스프레소 넣기");
    }

    // 상속 시 반드시 구현해야 하는 추상 메소드
    public abstract void putSomething();

    // 선택적 오버라이딩이 가능한 훅 메소드
    public void wrap() {
        System.out.println("먹고 가기 : 다회용잔에 담기");
    }
}
