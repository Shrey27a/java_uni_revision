class A {
    void showA() {
        System.out.println("Class A");
    }
}

class B extends A {
    void showB() {
        System.out.println("Class B");
    }
}

interface C {
    void showC();
}

class D extends B implements C {
    @Override
    public void showC() {
        System.out.println("Interface C");
    }

    void showD() {
        System.out.println("Class D");
    }
}

public class HybridInherit {
    public static void main(String[] args) {
        D obj1 = new D();

        obj1.showA();  // From A
        obj1.showB();  // From B
        obj1.showC();  // From Interface C
        obj1.showD();  // From D
    }
}
