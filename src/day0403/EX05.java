package day0403;

public class EX05 {
    public static void main(String[] args) {
        // 자료형 : 변수에 담길 데이터의 모양
        Product product = new Product();
        Computer computer = new Computer();
    }
}

// 도서 클래스
class Product {
    // 생성자 : 클래스로 객체를 만들 수 있는 방법
    Product() {
        System.out.println("product");
    }
}

class Computer {
    Computer() {
        System.out.println("computer");
    }
}
