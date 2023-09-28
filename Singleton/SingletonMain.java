import object.Government;

public class SingletonMain {
    public static void main(String[] args) {
        // Government government0 = new Government(); // 에러
        Government government1 = Government.getInstance();
        Government government2 = Government.getInstance();
        Government government3 = Government.getInstance();

        System.out.println(government1);
        System.out.println(government2);
        System.out.println(government3);

        government1.work("국가 안보");
        government2.work("경제적 삶 보장");
        government3.work("사회 질서");
    }
}
