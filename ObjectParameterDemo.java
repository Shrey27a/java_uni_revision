class Person {
    String name;
    int age;

    Person(String name , int age ) {
        this.name = name;
        this.age = age;
    }

    // Method that takes object as parameter
    void greet(Person p) {
        System.out.println("Hello " + p.name + "! I am " + this.name + " , " + this.age + " years old . ");
    }
}

public class ObjectParameterDemo {
    public static void main(String[] args) {
        Person p1 = new Person("Alice" , 20);
        Person p2 = new Person("Bob" , 15 );

        p1.greet(p2);  // Alice greets Bob
    }
}
