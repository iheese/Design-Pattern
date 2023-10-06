package child;

import parent.Observer;

public class Subscriber2 implements Observer {
    @Override
    public void notifyMessage() {
        System.out.println("Subscriber2 에게 이벤트 알람이 왔습니다.");
    }

    @Override
    public String toString() {
        return "Subscriber2";
    }
}
