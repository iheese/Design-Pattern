package factory;

import concreate.BananaItem;
import concreate.BoasterItem;
import framework.Item;

public class ItemFactory {

    public Item makeItem(String s) {
        if (s == "바나나") { return new BananaItem();}
        if (s == "부스터") { return new BoasterItem();}
        return null;
    }
}
