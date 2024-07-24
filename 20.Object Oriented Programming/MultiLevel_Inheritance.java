public class MultiLevel_Inheritance {
    public static void main(String[] args) {
        Dog dog = new Dog();
        dog.eat();
        dog.breathe();
        dog.bark();
    }
}

class Animal {
    String color;

    void eat() {
        System.out.println("eats");
    }

    void breathe() {
        System.out.println("breathes");
    }
}

class Mammal extends Animal {
    void walk() {
        System.out.println("walks");
    }
}

class Dog extends Mammal {
    void bark() {
        System.out.println("barks");
    }
}
