package concreate;

import framework.Item;

public class BoasterItem implements Item {
    @Override
    public void use() {
        System.out.println("부스터 아이템 사용!!!");
    }
}
