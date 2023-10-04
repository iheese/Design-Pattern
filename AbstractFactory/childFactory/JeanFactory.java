package childFactory;

import child.JeanPants;
import child.JeanShirt;
import parent.Pants;
import parent.Shirt;
import parentFactory.ClothesFactory;

public class JeanFactory implements ClothesFactory {
    @Override
    public Pants createPants() {
        return new JeanPants();
    }

    @Override
    public Shirt createShirt() {
        return new JeanShirt();
    }
}
