import childFactory.CottonFactory;
import childFactory.JeanFactory;
import parent.Pants;
import parent.Shirt;
import parentFactory.ClothesFactory;

public class AbstractFactoryMain {
    public static void main(String[] args) {
        ClothesFactory factory;

        factory = new CottonFactory();

        Pants cottonPants = factory.createPants();
        Shirt cottonShirt = factory.createShirt();
        System.out.println("---면 팩토리 실행 결과---");
        System.out.println(cottonPants.getClass().getName());
        System.out.println(cottonShirt.getClass().getName());

        factory = new JeanFactory();

        Pants jeanPants = factory.createPants();
        Shirt jeanShirt = factory.createShirt();
        System.out.println("---청 팩토리 실행 결과---");
        System.out.println(jeanPants.getClass().getName());
        System.out.println(jeanShirt.getClass().getName());
    }
}
