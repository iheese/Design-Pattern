package concreate;

import framework.Item;

public class BananaItem implements Item {
    @Override
    public void use() {
        System.out.println("바나나 아이템 사용!!!");
    }
}
