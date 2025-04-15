class Animal{
    void eat(){
        System.out.println("This animal eats food.");
    }
}

class Dog extends Animal{
    void bark(){
         System.out.println("Dog barks. ");
    }
 }


class puppy extends Dog{
    void weep(){
        System.err.println("Puppy Weeps. ");
    }
}
        
public class MultilevelInherit {
    public static void main(String[] args) {
        puppy obj1 =  new puppy();
        obj1.eat();
        obj1.bark();
        obj1.weep();
    }
}
