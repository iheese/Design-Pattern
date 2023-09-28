import child.NormalClient;
import child.Proxy;

public class ProxyMain {
    public static void main(String[] args) {
        // 프록시 적용 전
        System.out.println("---프록시 적용 전---");
        NormalClient chulsu = new NormalClient("철수", 1000L);
        NormalClient younghee = new NormalClient("영희", 3000L);

        // 철수 계정으로 영희가 얼마 있는지 알 수 있게 된다.
        System.out.println(chulsu.getInformation(younghee));

        // 프록시 적용 후
        System.out.println("---프록시 적용 후---");
        // 철수 프록시 적용
        Proxy proxy = new Proxy(chulsu);

        // 철수 프록시로 영희 조회
        System.out.println(proxy.getInformation(younghee));

        // 철수 프록시로 철수 조회
        System.out.println(proxy.getInformation(chulsu));
        System.out.println(proxy.getName());
        System.out.println(proxy.getAmount());
    }
}
