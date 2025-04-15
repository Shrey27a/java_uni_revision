class Animal{
    void eat (){
        System.out.println("This animal eats food.");
    }
}
 class Dog extends Animal{
    void bark()
    {
         System.out.println("Dog barks. ");
    }
 }

 public class SingleInherit {
    public static void main(String[] args){
        Dog obj1 = new Dog();
        obj1.eat();
        obj1.bark();
    }
 }






