package child;

import parent.Plug220;

public class KoreanPlug implements Plug220 {
    @Override
    public void charge220v() {
        System.out.println("한국콘센트: 220V로 충전!");
    }

    @Override
    public void remove220v() {
        System.out.println("한국콘센트: 220V 제거!");
    }
}
