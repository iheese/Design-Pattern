import facade.Facade;

public class FacadeMain {
    public static void main(String[] args) {
        Facade facade = new Facade();

        // 외출
        facade.goOut();

        // 귀가
        facade.comeIn();
    }
}
