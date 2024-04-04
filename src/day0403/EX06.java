package day0403;

public class EX06 {
    public static void main(String[] args) {
        Person person = new Person("person");
        Person person1 = new Person("person1");
        Person json = new Person("json");

        System.out.println(json.name);
    }
}

class Person {
    // 변수 - 부품 역할
    String name;

    // 생성자
    Person(String name) {
        this.name = name;
    }
}