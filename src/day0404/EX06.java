package day0404;

// 상속
public class EX06 {
    public static void main(String[] args) {
        Car bus = new Bus();
        Taxi taxi = new Taxi();

        bus.ride();
        taxi.ride();

        bus.getWheelNumber();
        taxi.getWheelNumber();

//        bus.ring();
    }
}

// 부모 -> 자식
class Car {
    int wheel = 4;

    void getWheelNumber() {
        System.out.println("바퀴 수: " + this.wheel);
    }

    void ride() {
        System.out.println("부아앙");
    }
}

class Bus extends Car {
//    int wheels = 4;
//
//    void getWheelNumber() {
//        System.out.println("바퀴 수 : " + this.wheels);
//    }

    Bus(){
//        super();
        new Car(); // 부모 생성자 호출
//        System.out.println("~");
    }

    void ride() {
        System.out.println("빵빵");
    }

    void ring(){
        System.out.println("삐");
    }
}

class Taxi extends Car {
//    int wheels = 4;
//
//    void getWheelNumber() {
//        System.out.println("바퀴 수 : " + this.wheels);
//    }
//
    void ride() {
        System.out.println("부릉부릉");
    }

}
