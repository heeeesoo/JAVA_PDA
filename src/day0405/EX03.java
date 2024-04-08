package day0405;

public class EX03 {
    public static void main(String[] args) {
        Garden garden = new Garden();
        Dog dog = new Dog();
        Cat cat = new Cat();
        System.out.println(dog instanceof Pet);
        garden.getSound(dog);
        garden.getSound(cat);
    }
}

class Garden {
    void getSound(Pet pet) {
        pet.cry();
    }
}

class Pet {
    void cry() {

    }
}

class Dog extends Pet {
    @Override
    void cry() {
        System.out.println("멍");
    }
}

class Cat extends Pet {
    @Override
    void cry() {
        System.out.println("야옹");
    }
}
