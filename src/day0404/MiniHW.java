package day0404;

// 우리는 상점에서 핸드폰 구매
// 쏘니는 핸드폰을 샀습니다.
// 베컴도 핸드폰을 샀습니다.
// 쏘니가 핸드폰을 켰습니다.
// "야 나 내 핸드폰 켜볼게"
// 핸드폰이 켜지면서
// "삐비빅" 소리 났다
// 베컴이 "나도 핸드폰 켜볼게"
// 핸드폰이 켜지면서
// "bbeep"

public class MiniHW {
    public static void main(String[] args) {
        Market market = new Market("상점");

        Person p1 = new Person("가나다");
        Person p2 = new Person("라마바");

        SamsungPhone sp = new SamsungPhone();
        ApplePhone ap = new ApplePhone();

        p1.setVoice("야 나 내 핸드폰 켜볼게");
        p1.getVoice();
        sp.turnOn();
        sp.ring();

        p2.setVoice("나도 핸드폰 켜볼게");
        p2.getVoice();
        ap.turnOn();
        ap.ring();
    }
}

class Market{
    String marketName;
    String[] log;

    Market(String marketName){
        this.marketName = marketName;
    }

}

class Person {
    private String name;
    private String voice;


    Person(String name) {
        this.name = name;
    }

    void getVoice() {
        System.out.println(this.name+":"+this.voice);
    }

    String getName(){
        return this.name;
    }

    void setVoice(String voice) {
        this.voice = voice;
    }
}

class SmartPhoneType {
    boolean power;
    void turnOn(){
        this.power = !this.power;
    }

    void ring(){
        System.out.println("폰 울림");
    }
}
class SamsungPhone extends SmartPhoneType{
    void ring(){
        if(this.power){
            System.out.println("삐비빅");
        }
    }
}
class ApplePhone extends  SmartPhoneType{
    void ring(){
        if(this.power){
            System.out.println("bbeep");
        }
    }
}