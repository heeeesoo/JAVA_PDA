package day0408;

public class EX01 {
    public static void main(String[] args) {
        Person person = new Person();
        ApplePhone applePhone = new ApplePhone();
        SamsungPhone samsungPhone = new SamsungPhone();
        person.buyPhone(samsungPhone);
        person.useKakaotalk();
        person.buyPhone(applePhone);
        person.useKakaotalk();


        // Person => ApplePhone 모든 기능
        // 30분까지
        // ApplePhone => SamsungPhone 기기변경
    }
}

class Test {
    private void test(){
        System.out.println("test");
    }
}

class Test1 extends Test {
    public void test(){
        System.out.println("hi");
    }
}
interface Phone {
    int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    int batteryStatus = 70; // 배터리 현재 용량
    boolean isOn = true;
    String name = "";

    boolean getIsOn();

    void charge();

    void operateKakaotalk();

    void checkBatteryStatus();

    String getName();

}

class SamsungPhone implements Phone {
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;
    private String name = "삼성";

    public boolean getIsOn() {
        return isOn;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;
            System.out.println(this.name + ": kakaotalk 사용");

//            if (batteryStatus == 0)
//                turnOff();
        }
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus + "%");
    }

    public String getName() {
        return this.name;
    }
}

class ApplePhone implements Phone {
    private final int BATTERY_MAX_CAPA = 100; // 배터리 최대 용량
    private int batteryStatus = 70; // 배터리 현재 용량
    private boolean isOn = true;
    private String name = "애플";

    public boolean getIsOn() {
        return isOn;
    }

    public String getName() {
        return this.name;
    }

    public void charge() {
        if (batteryStatus == BATTERY_MAX_CAPA) {
            System.out.println("100%입니다.");
            return;
        } else if (batteryStatus == 95) {
            batteryStatus += 5;
        } else {
            batteryStatus += 10;
        }

        System.out.println(batteryStatus
                + "%가 되었습니다.");
    }

    public void operateKakaotalk() {
        if (isOn) {
            batteryStatus -= 5;

            System.out.println(this.name + ": kakaotalk 사용");

//            if (batteryStatus == 0)
//                turnOff();
        }
    }

    public void checkBatteryStatus() {
        System.out.println(batteryStatus + "%");
    }

    // useYoutube() -10
    // turnOn
    // turnOff
}

class Person {
    Phone phone;

    // buyPhone()
    void buyPhone(Phone phone) {
        this.phone = phone;
        System.out.println(phone.getName() + " 구매 완료");
    }

    // charge()
    void chargePhone() {
        phone.charge();
    }

    // useKakaotalk()
    void useKakaotalk() {
        if (phone.getIsOn())
            phone.operateKakaotalk();
    }
}