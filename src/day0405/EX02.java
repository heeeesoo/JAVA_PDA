package day0405;

public class EX02 {
    public static void main(String[] args) {
        Parent parent = new Parent();
        Child child = new Child();
        Parent parent2 = new Child();

        parent.method();
        child.method();
        parent2.method(); // 자식 메소드

//        Child child2 = parent2;
        Child child2 = (Child) parent2;
//        parent2.method2();
        child2.method2();

        System.out.println(child2 instanceof Child);
        System.out.println(child2 instanceof Parent);
        System.out.println(parent2 instanceof Child);
        System.out.println(parent2 instanceof Parent);
    }
}

class Parent {
    void method() {
        System.out.println("부모 메소드");
    }
}

class Child extends Parent {
    @Override
    void method() {
        System.out.println("자식 메소드");
    }

    void method2() {
        System.out.println("method 2");
    }
}