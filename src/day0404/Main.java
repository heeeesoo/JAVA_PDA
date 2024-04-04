package day0404;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("사자","어흥");
        animal.growl();
        Animal dog = new Animal("바둑이","멍멍");
        dog.growl();
    }
}

class Animal {
    String name;
    String growlText;

    public void growl() {
        System.out.println(this.growlText);
    }

    Animal(String name, String growlText) {
        this.name = name;
        this.growlText = growlText;

    }
}