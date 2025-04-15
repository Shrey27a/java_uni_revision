interface Animal{
    void eat();
}
    
interface Bird{
    void fly();
}

class Bat implements Animal,Bird{
    public void eat(){
        System.out.println("Bat eats insects.");
    }

    public void fly(){
        System.out.println("Bats fly at night.");
    }
}
    
public class MultipleInherit {
    public static void main(String[] args) {
        Bat obj1 = new Bat();
        obj1.eat();
        obj1.fly();

    }
}
