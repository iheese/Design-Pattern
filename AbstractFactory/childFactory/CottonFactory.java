package childFactory;

import child.CottonPants;
import child.CottonShirt;
import parent.Pants;
import parent.Shirt;
import parentFactory.ClothesFactory;

public class CottonFactory implements ClothesFactory {
    @Override
    public Pants createPants() {
        return new CottonPants();
    }

    @Override
    public Shirt createShirt() {
        return new CottonShirt();
    }
}
