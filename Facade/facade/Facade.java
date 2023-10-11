package facade;

import sub.Bag;
import sub.Clothes;
import sub.Door;

public class Facade {
    Clothes clothes = new Clothes();
    Bag bag = new Bag();
    Door door = new Door();

    public void goOut() {
        System.out.println("---외출 준비 시작---");
        clothes.putOn();
        bag.packSpareBattery();
        bag.packWallet();
        bag.packUmbrella();
        door.openDoor();
        door.closeDoor();
        System.out.println("---외출 완료---");
    }

    public void comeIn() {
        System.out.println("---귀가 시작---");
        door.openDoor();
        door.closeDoor();
        bag.putDown();
        clothes.takeOff();
        System.out.println("---귀가 완료---");
    }
}
