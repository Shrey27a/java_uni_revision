class A {
    void display() {
        System.out.println("Class A: This is the parent class.");
    }
}

class B extends A {
    void show() {
        System.out.println("Class B: This is the child class.");
    }
}
public class SingleInheritance{
    public static void main(String[] args) {
        B obj = new B(); // Creating an object of Class B

        obj.display();
        obj.show();   
    }
}

