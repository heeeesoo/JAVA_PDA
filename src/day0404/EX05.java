package day0404;

public class EX05 {
    public static void main(String[] args) {
        Person2 ps = new Person2(
                "dragon",
                20,
                "010-2020-3021");


    }
}

class Person2 {
    String name;
    int age;
    String phoneNumber;

    Person2(String name, int age, String phoneNumber) {
        this.name = name;
        this.age = age;
        this.phoneNumber = phoneNumber;
    }
}