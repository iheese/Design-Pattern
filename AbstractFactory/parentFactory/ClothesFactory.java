package parentFactory;

import parent.Pants;
import parent.Shirt;

public interface ClothesFactory {
    Pants createPants();
    Shirt createShirt();
}
