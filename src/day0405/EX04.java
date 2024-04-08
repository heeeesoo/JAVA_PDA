package day0405;

public class EX04 {
    public static void main(String[] args) {

        Pasta pasta = new Pasta();
        Soup soup = new Soup();
        Recipe recipe = new Recipe();

        pasta.setName("파스타");
        soup.setName("수프");

        recipe.getInfo(soup);
    }
}

class Recipe {

    void getInfo(Food food) {
        System.out.println(food.getName() + "의 레시피 입니다.");
        food.makeFood();
    }

}

abstract class Food {
    String name;


    void setName(String name) {
        this.name = name;
    }

    public abstract void makeFood();

    String getName() {
        return this.name;
    }
}

class Pasta extends Food {
    void makeSource() {
        System.out.println("소스를 만든다.");
    }

    @Override
    public void makeFood() {
        System.out.println("파스타 만드는 중");
    }

}

class Soup extends Food {
    void boil() {
        System.out.println("끓이다.");
    }

    @Override
    public void makeFood() {
        System.out.println("수프 만드는 중");
    }
}
