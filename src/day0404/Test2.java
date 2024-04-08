package day0404;

public class Test2 {
    public static void main(String[] args) {
        Character c1 = new Character();
        Character c2 = new Character("가나다");

    }
}

class Character {
    String name;
    int age;
    int power;

    Character(){
        System.out.println("character setting 완료");
    }

    Character(String name){
        this.name = name;
        System.out.println(name + ": character setting 완료");
    }
}