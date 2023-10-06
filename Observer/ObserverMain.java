import child.Subscriber1;
import child.Subscriber2;
import child.Subscriber3;
import child.YoutubeChannel;
import parent.Observer;
import parent.Publisher;

public class ObserverMain {
    public static void main(String[] args) {
        // 발행자인 유투브 채널 객체 생성
        Publisher youtubeChannel = new YoutubeChannel();

        // 관찰자인 구독자들 객체 생성
        Observer subscriber1 = new Subscriber1();
        Observer subscriber2 = new Subscriber2();
        Observer subscriber3 = new Subscriber3();

        // 채널 구독
        youtubeChannel.addObserver(subscriber1);
        youtubeChannel.addObserver(subscriber2);
        youtubeChannel.addObserver(subscriber3);

        // 이벤트 알람 전달
        youtubeChannel.notifyObservers();

        // 구독자2 채널 구독 종료
        youtubeChannel.removeObserver(subscriber2);

        // 이벤트 알람 전달
        youtubeChannel.notifyObservers();
    }
}
