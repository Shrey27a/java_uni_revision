// Parent class
class Animal {
    String color = "Brown";

    Animal() {
        System.out.println("Animal constructor called");
    }

    void sound() {
        System.out.println("Animal makes a sound");
    }
}

// Child class
class Dog extends Animal {
    String color = "Black";

    Dog() {
        super(); // Calling parent class constructor
        System.out.println("Dog constructor called");
    }

    void printColor() {
        System.out.println("Dog color: " + color);           // Child class variable
        System.out.println("Animal color: " + super.color);  // Parent class variable using super
    }

    void sound() {
        super.sound(); // Calling parent class method
        System.out.println("Dog barks");
    }
}

// Main class
public class SuperKeywordDemo {
    public static void main(String[] args) {
        Dog d = new Dog();       // Constructor of Animal and Dog will be called
        d.printColor();          // Shows use of super with variable
        d.sound();               // Shows use of super with method
    }
}
 
