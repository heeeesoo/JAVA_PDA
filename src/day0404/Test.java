package day0404;

public class Test {
    public static void main(String[] args) {
        GameOne go = new GameOne();
        GameTwo gt = new GameTwo();
        go.getSound();
        gt.getSound();
    }
}

class Game {
    String title;

    void getSound() {
        System.out.println("AAA");
    }
}

class GameOne extends Game {
    void getSound() {
        System.out.println("bbb");
    }
}

class GameTwo extends Game {
    void getSound() {
        System.out.println("ccc");
    }
}
