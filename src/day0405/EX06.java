package day0405;

public class EX06 {
    public static void main(String[] args) {
        Person person = new Person();
        SmartPhone sp = new SmartPhone();
        person.setSmartPhone(sp);
        person.getSmartPhone().use();
        person.getSmartPhone().getBatteryCap();


    }
}

class Person {
    SmartPhone sp;

    void setSmartPhone(SmartPhone sp) {
        this.sp = sp;
    }

    SmartPhone getSmartPhone(){
        return this.sp;
    }
}


class SmartPhone {
    int batteryCap = 100;
    boolean state = true;

    void use() {
        if (this.batteryCap >= 10) {
            this.batteryCap -= 10;
        }
    }

    void charge() {
        if (this.batteryCap <= 90) {
            this.batteryCap += 10;
        }
    }

    void useYoutube() {
        if (this.batteryCap >= 10) {
            this.batteryCap -= 10;
        }
    }

    void getBatteryCap() {
        System.out.println(this.batteryCap);
    }

    void turnOn() {

    }

    void turnOff() {

    }

    void Test() {

    }


}