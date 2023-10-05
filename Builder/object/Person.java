package object;

public class Person {

    // 필수 인자
    private String name;
    private int age;

    // 선택 인자
    private boolean isMarried;
    private boolean hasCar;

    private Person(Builder builder) {
        this.name = builder.name;
        this.age = builder.age;
        this.isMarried = builder.isMarried;
        this.hasCar = builder.hasCar;
    }

    @Override
    public String toString() {
        return "Person { " +
                "name = " + name +
                ", age = " + age +
                ", isMarried = " + isMarried +
                ", hasCar = " + hasCar +
                " }";
    }

    public static class Builder {
        private String name;
        private int age;

        private boolean isMarried;
        private boolean hasCar;

        // 필수 인자 빌더 생성자
        public Builder(String name, int age) {
            this.name = name;
            this.age = age;
        }

        // 선택 인자 빌더 메소드
        public Builder isMarried(boolean isMarried) {
            this.isMarried = isMarried;
            return this;
        }

        public Builder hasCar(boolean hasCar) {
            this.hasCar = hasCar;
            return this;
        }

        public Person build() {
            return new Person(this);
        }
    }
}
