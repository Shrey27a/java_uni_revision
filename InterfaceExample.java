
interface Animal {
    void makeSound();           
    void eat();

   
    default void sleep() {
        System.out.println("Animal is sleeping...");
    }
}


class Dog implements Animal {
    public void makeSound() {
        System.out.println("Dog says: Woof!");
    }

    public void eat() {
        System.out.println("Dog is eating bones.");
    }
}


class Cat implements Animal {
    public void makeSound() {
        System.out.println("Cat says: Meow!");
    }

    public void eat() {
        System.out.println("Cat is eating fish.");
    }
}


public class InterfaceExample {
    public static void main(String[] args) {
        Animal dog = new Dog();
        Animal cat = new Cat();

        dog.makeSound();
        dog.eat();
        dog.sleep();   

        System.out.println();  

        cat.makeSound();
        cat.eat();
        cat.sleep();  
    }
}
