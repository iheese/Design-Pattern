package object;

public class Government {
    // 기본 생성자 객체 생성 방지
    private Government() {}

    // 정적 참조 변수
    private static Government government;

    // 정적 메소드
    public static Government getInstance() {
        // 참조 변수 null 일 때 객체 생성
        if(government == null) {
            government = new Government();
        }
        return government;
    }

    public void work(String s) {
        System.out.println(s + "작업을 수행했습니다.");
    }
}
