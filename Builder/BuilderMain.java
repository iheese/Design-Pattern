import object.Person;

public class BuilderMain {
    public static void main(String[] args) {
        Person person1 = new Person.Builder("iheese", 50)
                .isMarried(true)
                .hasCar(false)
                .build();

        Person person2 = new Person.Builder("chulsu", 20)
                .build();

        System.out.println(person1.toString());
        System.out.println(person2.toString());
    }
}
