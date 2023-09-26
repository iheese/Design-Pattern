import child.Americano;
import child.CafeLatte;
import child.ToGoAmericano;
import child.ToGoCafeLatte;
import parent.Coffee;

public class TemplateMethodMain {
    public static void main(String[] args) {
        Coffee americano = new Americano();
        Coffee cafeLatte = new CafeLatte();
        Coffee toGoAmericano = new ToGoAmericano();
        Coffee toGoCafeLatte = new ToGoCafeLatte();

        System.out.println("---아메리카노 만들기 시작---");
        americano.makeCoffee();
        System.out.println("---카페라떼 만들기 시작---");
        cafeLatte.makeCoffee();

        System.out.println("---Togo 아메리카노 만들기 시작---");
        toGoAmericano.makeCoffee();
        System.out.println("---Togo 카페라떼 만들기 시작---");
        toGoCafeLatte.makeCoffee();
    }
}
