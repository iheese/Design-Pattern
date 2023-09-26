import Client.Person;
import child.Eat;
import child.Play;
import child.Sleep;
import parent.Strategy;

public class StrategyMain {
    public static void main(String[] args) {
        Person person = new Person();

        Strategy eat = new Eat();
        Strategy play = new Play();
        Strategy sleep = new Sleep();

        person.getStress(eat);
        person.getStress(play);
        person.getStress(sleep);
    }
}
