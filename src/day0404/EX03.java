package day0404;

public class EX03 {
    public static void main(String[] args) {
        Coffee2 coffee2 = new Coffee2(4500,true,"M");
        Barista chunsik = new Barista("춘식");
        coffee2.setPrice(5000);
        chunsik.getCoffeeInfo(coffee2.getCoffee());

        chunsik.makeCoffee();
    }
}

class Barista {
    String name;
    int price;

    Barista(String name) {
        this.name = name;
        this.price = 4500;
    }

    void getCoffeeInfo(int price) {
        System.out.println("이 커피는 " + price + "원입니다.");
    }

    void makeCoffee() {
        System.out.println("커피 여기 있습니다~");
    }
}

class Coffee2 {
    private int price;
    private boolean isHot;
    private String size;

    Coffee2(int price, boolean isHot, String size) {
        this.price = price;
        this.isHot = isHot;
        this.size = size;
    }

    public void setPrice(int price) {
        if (price >= this.price) {
            this.price = price;
        }

    }

    public int getCoffee(){
        return this.price;
    }

    public void getInfo() {
        System.out.println("커피 가격: " + this.price);
        if (this.isHot) {
            System.out.println("커피: 핫");
        } else {
            System.out.println("커피 아이스");
        }
        System.out.println("커피 사이즈: " + this.size);
    }


}