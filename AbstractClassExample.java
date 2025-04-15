// Abstract class
abstract class Animal {
    abstract void makeSound(); // Abstract method

    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

// Subclass
class Dog extends Animal {
    void makeSound() {
        System.out.println("Dog barks: Woof Woof!");
    }
}

public class AbstractClassExample {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.makeSound();
        d.sleep();
    }
}
