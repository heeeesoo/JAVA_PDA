package day0404;

// 우리는 상점에서 핸드폰 구매
// 가나다는 핸드폰을 샀습니다.
// 라마바도 핸드폰을 샀습니다.
// 가나다가 핸드폰을 켰습니다.
// "야 나 내 핸드폰 켜볼게"
// 핸드폰이 켜지면서
// "삐비빅" 소리 출력
// 라마바이 "나도 핸드폰 켜볼게"
// 핸드폰이 켜지면서
// "bbeep" 소리 출력

public class MiniHW {
    public static void main(String[] args) {
        Market market = new Market("상점");

        Person p1 = new Person("가나다");
        Person p2 = new Person("라마바");

        SamsungPhone sp = new SamsungPhone();
        ApplePhone ap = new ApplePhone();

        sp.setOwner(p1);
        ap.setOwner(p2);

        p1.talk("야 나 내 핸드폰 켜볼게");
        sp.turnOn();
        sp.ring();

        p2.talk("나도 핸드폰 켜볼게");
        ap.turnOn();
        ap.ring();
    }
}

class Market {
    String marketName;

    Market(String marketName) {
        this.marketName = marketName;
    }

}

class Person {
    private String name;
    private String voice;


    Person(String name) {
        this.name = name;
    }

    void talk(String text){
        System.out.println(this.name+" : "+text);
    }

    String getName(){
        return this.name;
    }

}

class SmartPhoneType {
    boolean power;
    Person owner;

    void turnOn() {
        this.power = !this.power;
    }

    void ring() {
        System.out.println("폰 울림");
    }

    void setOwner(Person owner){
        this.owner = owner;
    }
}

class SamsungPhone extends SmartPhoneType {
    void ring() {
        if (this.power) {
            System.out.println(this.owner.getName()+"폰 : 삐비빅");
        }
    }
}

class ApplePhone extends SmartPhoneType {
    void ring() {
        if (this.power) {
            System.out.println(this.owner.getName()+"폰 : bbeep");
        }
    }
}