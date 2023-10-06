package child;

import parent.Observer;
import parent.Publisher;

import java.util.ArrayList;
import java.util.List;

public class YoutubeChannel implements Publisher {
    // 구독자 목록 (관찰자 목록)
    List<Observer> subscriberList = new ArrayList<>();

    // 구독 리스트에 추가
    @Override
    public void addObserver(Observer subscriber) {
        subscriberList.add(subscriber);
        System.out.println(subscriber + " 구독 시작");
    }

    // 구독 리스트에서 제거
    @Override
    public void removeObserver(Observer subscriber) {
        subscriberList.remove(subscriber);
        System.out.println(subscriber + " 구독 종료");
    }

    // 구독자들에게 이벤트 송신
    @Override
    public void notifyObservers() {
        subscriberList.stream().forEach(observer -> observer.notifyMessage());
    }
}
