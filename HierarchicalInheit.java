class Animal{
    void eat(){
        System.out.println("this animal eats food.");
    }
}

class Dog extends Animal{
    void bark(){
         System.out.println("Dog barks. ");
    }
 }
 
 class Cat extends Animal{
    void meow(){
         System.out.println("Cat Meows.");
    }
 }
 
 public class HierarchicalInheit {
    
    public static void main(String[] args) {
        Dog obj1 =  new Dog();
        obj1.eat();
        obj1.bark();

        Cat obj2 =  new Cat();
        obj2.eat();
        obj2.meow();
        
    }
}

