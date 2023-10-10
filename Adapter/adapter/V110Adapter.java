package adapter;

import child.JapanPlug;
import parent.Plug110;
import parent.Plug220;

public class V110Adapter implements Plug220 {
    private final Plug110 plug110;

    public V110Adapter(JapanPlug japanPlug) {
        this.plug110 = japanPlug;
    }
    @Override
    public void charge220v() {
        System.out.println("110V 어댑터 사용");
        plug110.charge110v();
    }

    @Override
    public void remove220v() {
        System.out.println("110V 어댑터 사용");
        plug110.remove110v();
    }
}
