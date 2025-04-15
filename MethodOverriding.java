class Animal{
    void sound(){
        System.out.println("Animals make sound");
    }
}

class Dog extends Animal{
    @Override
    void sound(){
         System.out.println("Dog barks. ");
    }
 }
 
 class Cat extends Animal{
    @Override
    void sound(){
         System.out.println("Cat Meows.");
    }
 }
 
 
 public class MethodOverriding {
    public static void main(String[] args) {
        Animal a;
        a = new Dog();
        a.sound();

        a = new Cat();
        a.sound();
    }
}
