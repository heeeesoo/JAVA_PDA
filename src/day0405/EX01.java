package day0405;

public class EX01 {
    public static void main(String[] args) {
        Cow cow = new Cow();
        Chicken chicken = new Chicken();
        Farm farm = new Farm(cow, chicken);

        farm.getSound();
    }
}

class Farm {
    Cow cow;
    Chicken chicken;

    Farm(Cow cow, Chicken chicken) {
        this.cow = cow;
        this.chicken = chicken;
    }

    void getSound() {
        this.cow.cry();
        this.chicken.cry();
    }
}

class Animal {
    void cry() {

    }
}

class Cow extends Animal {

    // 오버라이딩 : 부모 클래스에서 상속받은 메소드 자식 클래스에서 재정의
    @Override
    void cry() {
        System.out.println("음메");
    }
}

class Chicken extends Animal {

    // 오버라이딩
    @Override
    void cry() {
        System.out.println("꼬끼오");
    }
}