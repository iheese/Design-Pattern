package child;

import parent.Plug110;

public class JapanPlug implements Plug110 {
    @Override
    public void charge110v() {
        System.out.println("일본콘센트: 110V로 충전!");
    }

    @Override
    public void remove110v() {
        System.out.println("일본콘센트: 110V 제거!");
    }
}
