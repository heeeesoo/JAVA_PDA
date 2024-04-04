package day0404;

import java.sql.SQLOutput;

public class EX02 {
    public static void main(String[] args) {
        Coffee coffee = new Coffee(1000, false, "M");
        coffee.getInfo();
        coffee.setPrice(800);
        coffee.getInfo();
    }
}

class Coffee {
    private int price;
    private boolean isHot;
    private String size;

    Coffee(int price, boolean isHot, String size) {
        this.price = price;
        this.isHot = isHot;
        this.size = size;
    }

    public void setPrice(int price) {
        if (price >= this.price) {
            this.price = price;
        }

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