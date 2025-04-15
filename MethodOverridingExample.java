 // Parent class
class Animal {
    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    // Overriding the sound() method of Animal class
    @Override
    void sound() {
        System.out.println("Dog barks");
    }
}

// Another child class
class Cat extends Animal {
    // Overriding the sound() method of Animal class
    @Override
    void sound() {
        System.out.println("Cat meows");
    }
}

// Main class
public class MethodOverridingExample {
    public static void main(String[] args) {
        Animal a; // Reference of parent class

        a = new Dog();  // a refers to Dog
        a.sound();      // Outputs: Dog barks

        a = new Cat();  // a refers to Cat
        a.sound();      // Outputs: Cat meows
    }
}
 