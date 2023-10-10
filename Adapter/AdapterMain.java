import adapter.V110Adapter;
import child.JapanPlug;
import child.KoreanPlug;
import parent.Plug220;

public class AdapterMain {
    public static void main(String[] args) {
        Plug220 koreanPlug = new KoreanPlug();
        koreanPlug.charge220v();
        koreanPlug.remove220v();

        System.out.println("---Adapter 사용---");
        koreanPlug = new V110Adapter(new JapanPlug());
        koreanPlug.charge220v(); // 위 메소드와 똑같이 사용해도 결과가 다르다.
        koreanPlug.remove220v();
    }
}
